package imooc;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.sound.sampled.Line;

public class Worker {
    public void doSomeWork() {
		System.out.println("Œ“ «Worker");
	}
	
	
    public static void main(String[] args) {
    	 Plumber plumber = new Plumber();
    	 AWorker aWorker = new AWorker(plumber);
    	 aWorker.doSomeWork();
	}
}