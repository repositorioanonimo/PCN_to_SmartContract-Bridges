package sce.generator.pcn;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class PcnGenHandler extends AbstractHandler implements IHandler {
	private FileManager fm = new FileManager();
	private PcnGenInterfaces ui = new PcnGenInterfaces();
	private PcnGenerator generator = new PcnGenerator();
	
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
	      
	            	// Se obtiene el recurso
		            URI uri = URI.createFileURI(((IFile) element).getFullPath().toString());  
		            ResourceSet rs = new ResourceSetImpl();  	                
		            Resource r = rs.getResource(uri, true);
              		            		       	           		
		            // Crea el fichero generado vacío
				    IFile srcGenFile = fm.createSrcGenFile((IFile) element);
							       
			        // Se pasa el fichero generado vacío y el recurso al generador		                
			        try {
			        	generator.generate(r, srcGenFile);
			        // Si algo sale mal, es que el código del fichero no respeta el formato de smart contract basado en PCN
					} catch (Exception e) {
						ui.noFileWarningMessage();
					} 
			        
			        // Calcula el tiempo tardado y finaliza la ejecución
		            long fin = System.nanoTime();
		            long tiempo = fin-inicio;
		            double tiempoMillis = tiempo / 1_000_000.0;
		            System.out.println("Modelo PCN generado: " + ((IFile) element).getName().replace(".sce", ".pcn") + ", Tiempo: " + tiempoMillis/1000 + "s");
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