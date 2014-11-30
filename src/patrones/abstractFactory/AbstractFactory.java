/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patrones.abstractFactory;

/**
 *
 * @author JuanManuel
 */
public abstract class AbstractFactory {
    public final static int EMBER=0;
    private static final EmberFactory emberToolkit = new EmberFactory();
  //private static final EnginolaToolkit enginolaToolkit = new EnginolaToolkit();
  
  // Returns a concrete factory object that is an instance of the
  // concrete factory class appropriate for the given architecture.
  public static final AbstractFactory getFactory(int architecture)
  {
    switch (architecture)
    {
     // case ENGINOLA:
       // return enginolaToolkit;

      case EMBER:
        return emberToolkit;
       
    } // switch
    String errMsg = Integer.toString(architecture);
    throw new IllegalArgumentException(errMsg);
  } // getFactory()

  public abstract CPU createCPU();
  public abstract MMU createMMU();
}
