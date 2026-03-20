package pcn.generator.sce;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import pcn.PCNReference;

public class SceGenHandler extends AbstractHandler implements IHandler {
	private FileManager fm = new FileManager();
	private SceGenInterfaces ui = new SceGenInterfaces();
	private SceGenerator generator = new SceGenerator();
	
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        ISelection selection = HandlerUtil.getCurrentSelection(event);
        if (selection instanceof IStructuredSelection && selection != null) {
            IStructuredSelection structuredSelection = (IStructuredSelection) selection;
            for(Object element : structuredSelection.toList()) {
	            if (element instanceof IFile) {
	            	// Comienza a calcular el tiempo tardado
	            	long inicio = System.nanoTime();
	            	
	            	// Crea el directorio para el fichero generado
	            	fm.createSrcGenFolder((IFile) element);	            	
	      
	            	// Se trata de obtener el recurso del fichero
	            	boolean noResource = false;
	            	Resource r = null;
	            	try {
		                URI uri = URI.createFileURI(((IFile) element).getFullPath().toString());  
		                ResourceSet rs = new ResourceSetImpl();  	                
		                r = rs.getResource(uri, true);
	            	} catch (Exception e) {
	                	noResource = true;
	                }
	            	
	            	// Si no se encuentra el recurso, muestra una UI de advertencia y se acaba la ejecución
	            	if (noResource) {
	            		ui.noResourceWarningMessage();
	            	}
	            	else {
		                // Se buscan PCN References en el recurso
		                boolean referenceFound = false;
		                for (TreeIterator<EObject> iterator = r.getAllContents(); iterator.hasNext(); ) {
		                    EObject eObject = iterator.next();
		                    if (eObject instanceof PCNReference) {
		                        referenceFound = true;
		                    }
		                }
		                
		                // Si el diagrama tiene References, muestra una UI de advertencia y se acaba la ejecución	
		                if (referenceFound) {             	
							ui.referenceWarningMessage();	                 
		                }
		                else {
		                	// Crea el fichero generado vacío
				            IFile srcGenFile = fm.createSrcGenFile((IFile) element);
							       
				            // Se pasa el fichero generado vacío y el recurso al generador		                
				            try {
								generator.generate(r, srcGenFile);
							} catch (CoreException e) {
								e.printStackTrace();
							} 	                		
		                }
	            	}
	            	
	            	// Calcula el tiempo tardado y finaliza la ejecución
	                long fin = System.nanoTime();
	                long tiempo = fin-inicio;
	                double tiempoMillis = tiempo / 1_000_000.0;
	                System.out.println("Modelo SmaC generado: " + ((IFile) element).getName().replace(".pcn", ".sce") + ", Tiempo: " + tiempoMillis/1000 + "s");
	            }
            }
        }     
        return null;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}