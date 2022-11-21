package com.laptop;

import com.laptop.classes.AMDProcessor;
import com.laptop.classes.NvideaGraphics;
import com.laptop.classes.SamsungRam;
import com.laptop.classes.WindowsOperatingSystem;
import com.laptop.interfaces.Graphics;
import com.laptop.interfaces.Memory;
import com.laptop.interfaces.OperatingSystem;
import com.laptop.interfaces.Processor;

public class Laptop {
    private Processor processor;
    private Memory memory;
    private Graphics graphics;
    private OperatingSystem os;

    public Laptop()
    {

    System.out.println( "Hello This is your Laptop!" ); 

    this.processor = new AMDProcessor();
    this.memory = new SamsungRam();
    this.graphics = new NvideaGraphics();
   
    os = new WindowsOperatingSystem();
    
    System.out.println("Booting done with Processor:, RAM:, Graphics:"+
    processor.specs + memory.specs + graphics.specs);


    }

}
