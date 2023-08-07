package org.tatek;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        XlsxProcessor.objectProcessor();
        System.out.println(CandidateDetails.getCandidates());
    }
}
