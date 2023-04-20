package InsertarDatosDB;


		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.Statement;
		public class Insertar {
		  public static void main(String[] args) {
		    
		    Connection conexion;
		    String url="jdbc:mysql://localhost:3306/escuela";
		    String usuario="root";
		    String clave="Franc0u0442@";
		    String consulta="insert into profesores(ProfDni,ProfNom,ProfApe,ProfMat) values('50','Roberto','Gonzales',4)";
		        
		    try {
		    	Class.forName("com.mysql.jdbc.Driver");     
		        conexion=DriverManager.getConnection(url,usuario,clave);    
		        Statement sentencia=conexion.createStatement();
		        sentencia.execute(consulta);   
		        System.out.println("Los nuevos datos se agregaron a la tabla!!");
		    } catch (Exception e) {  
		      e.printStackTrace();
		      System.out.println("Error en la insercion de datos!!");
		    }
		  }
		}

	


