package org.tektutor;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * Goal which print hello.
 */
@Mojo( name = "hello", defaultPhase = LifecyclePhase.VALIDATE )
public class MyMojo
    extends AbstractMojo
{
    public void execute()
        throws MojoExecutionException
    {
	System.out.println ( "TekTutor - Custom Hello Plugin ..." );
    }
}
