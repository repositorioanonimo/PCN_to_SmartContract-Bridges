package pcn.generator.sce;

import java.io.ByteArrayInputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;

public class FileManager {
	
	/** 
	 *	Creates (if it does not exist) the destination folder for the generated file
	 * 	@param element is the selected file to apply the generator to
	 *	@return the destination folder for the generated file
	 */	
    public IFolder createSrcGenFolder(IFile element) {
    	IProject project = element.getProject();
        IFolder srcGenFolder = project.getFolder("sce-gen");
        if (!srcGenFolder.exists()) {
            try {
                srcGenFolder.create(true, true, new NullProgressMonitor());
            } catch (CoreException e) {
            	e.printStackTrace();
            }
        }
		return srcGenFolder;
    }
    
	/** 
	 *	Create (if it does not exist) the generated file empty to dump its content later
	 * 	@param element is the selected file to apply the generator to
	 * 	@return the generated file empty
	 */	
    public IFile createSrcGenFile(IFile element) {
    	IProject project = element.getProject();
    	IFolder srcGenFolder = project.getFolder("sce-gen");
    	IFile srcGenFile = srcGenFolder.getFile(element.getName().replace(".pcn", ".sce"));       	             
        if (!srcGenFile.exists()) {
        	try {
				srcGenFile.create(new ByteArrayInputStream(new byte[0]), true, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
        }
		return srcGenFile;   	
    }
}
