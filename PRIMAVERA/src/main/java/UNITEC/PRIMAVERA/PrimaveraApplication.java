package UNITEC.PRIMAVERA;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimaveraApplication implements CommandLineRunner{   //corre el main con ejecuciones 
    int x;

	public static void main(String[] args) {  //
		SpringApplication.run(PrimaveraApplication.class, args);
                
            
	}

    @Override
    public void run(String... args) throws Exception {
      //To change body of generated methods, choose Tools | Templates.
    x=2;
        System.out.println("Hola mundo");
    }
}
