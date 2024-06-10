import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public CrabWorld()
    {    
        super(560, 560, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,115,153);
        Worm worm = new Worm();
        addObject(worm,225,60);
        Worm worm2 = new Worm();
        addObject(worm2,396,25);
        Worm worm3 = new Worm();
        addObject(worm3,516,88);
        Worm worm4 = new Worm();
        addObject(worm4,491,224);
        Worm worm5 = new Worm();
        addObject(worm5,170,285);
        Worm worm6 = new Worm();
        addObject(worm6,229,415);
        Worm worm7 = new Worm();
        addObject(worm7,346,448);
        Worm worm8 = new Worm();
        addObject(worm8,459,406);
        Worm worm9 = new Worm();
        addObject(worm9,317,301);
        Worm worm10 = new Worm();
        addObject(worm10,381,165);
        Worm worm11 = new Worm();
        addObject(worm11,192,407);
        Worm worm12 = new Worm();
        addObject(worm12,38,462);
        Worm worm13 = new Worm();
        addObject(worm13,114,497);
        Worm worm14 = new Worm();
        addObject(worm14,307,524);
        Worm worm15 = new Worm();
        addObject(worm15,535,493);
        Worm worm16 = new Worm();
        addObject(worm16,84,339);
        Worm worm17 = new Worm();
        addObject(worm17,200,333);
        Worm worm18 = new Worm();
        addObject(worm18,228,210);
        Worm worm19 = new Worm();
        addObject(worm19,443,299);
        Worm worm20 = new Worm();
        addObject(worm20,373,334);
        Worm worm21 = new Worm();
        addObject(worm21,344,395);
    }
}
