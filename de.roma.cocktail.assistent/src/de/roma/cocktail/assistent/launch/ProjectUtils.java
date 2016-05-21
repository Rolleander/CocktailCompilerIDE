package de.roma.cocktail.assistent.launch;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;

public abstract class ProjectUtils {
	
	public static IProject[] getProjectList()
	{
		return ResourcesPlugin.getWorkspace().getRoot().getProjects();
	}
	
	public static IProject getProject(String name)
	{
		for(IProject project: getProjectList())
		{
			if(project.getName().equals(name))
			{
				return project;
			}
		}
		return null;
	}

}
