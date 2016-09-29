package ar.edu.grupoesfera.cursospring.modelo;

import java.io.*;
import java.util.ArrayList;

public class ListaDeTurnos {
	ArrayList <Turno> lista= new ArrayList <Turno> ();
	public ListaDeTurnos(){
	      File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      Turno turno = null;
	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("C:\\archivo.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);

	         // Lectura del fichero
	         String linea;

	         while((linea=br.readLine())!=null){
	        	 String[] partes = linea.split("&");
	        	 if(partes[0].equals("s")){
		        	turno = new Turno(); 
		         	turno.setDisponible(partes[0]);
		         	turno.setEspecialidad(partes[1]);
		         	turno.setFecha(partes[2]);
		         	turno.setHorario(partes[3]);
		       
		         	lista.add(turno);
		            System.out.println(partes[0]+" "+partes[1]+" "+partes[2]+" "+partes[3]);
	        	 }
	         }
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	}
	public ArrayList<Turno> getLista() {
		return lista;
	}
	public void setLista(ArrayList<Turno> lista) {
		this.lista = lista;
	}
	
	public void guardarLista(String linea){
		ArrayList <String> texto_nuevo= new ArrayList <String> ();
		
		//abrir el archivo
		 File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      try {
	         archivo = new File ("C:\\archivo.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	         String nueva_linea;

	         while((nueva_linea=br.readLine())!=null){
	        	 
	        	 if(nueva_linea.equals(linea)){
	        		 String[] partes = nueva_linea.split("|");
	        		 
	        		 texto_nuevo.add("s"+"|"+partes[1]+"|"+partes[2]+"|"+partes[3]);
	        	 }else{
	        		 texto_nuevo.add(nueva_linea);
	        	 }

	         }
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	      
	      
	      //guardar el nuevo archivo sobre el anterior
	        FileWriter fichero = null;
	        PrintWriter pw = null;
	        try
	        {
	            fichero = new FileWriter("archivo.txt");
	            pw = new PrintWriter(fichero);
	            
	            for (int i = 0; i < texto_nuevo.size(); i++){
	            	 pw.println(texto_nuevo.get(i));
	            }
	               
	             	
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	           try {
	           if (null != fichero)
	              fichero.close();
	           } catch (Exception e2) {
	              e2.printStackTrace();
	           }
	        }
		
	}
}
