package org.example.Action;

import javax.json.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;


        import java.io.FileNotFoundException;
        import java.io.FileOutputStream;
        import java.io.OutputStream;

        import javax.json.Json;
        import javax.json.JsonArrayBuilder;
        import javax.json.JsonObject;
        import javax.json.JsonObjectBuilder;
        import javax.json.JsonWriter;

import org.example.Structure.Person ;
import org.example.Structure.Intern ;
import org.example.Structure.Manager ;
import org.example.Structure.Employee ;

public class JSONWriter {

    public static void main(String[] args) throws FileNotFoundException {

        Employee emp = createEmployee();

        JsonObjectBuilder empBuilder = Json.createObjectBuilder();
        JsonObjectBuilder addressBuilder = Json.createObjectBuilder();
        JsonArrayBuilder phoneNumBuilder = Json.createArrayBuilder();



        empBuilder.add("id", emp.getId())
                .add("role", emp.getRole());


        JsonObject empJsonObject = empBuilder.build();

        System.out.println("Employee JSON String\n"+empJsonObject);

        //write to file
        OutputStream os = new FileOutputStream("emp.txt");
        JsonWriter jsonWriter = Json.createWriter(os);
        /**
         * We can get JsonWriter from JsonWriterFactory also
         JsonWriterFactory factory = Json.createWriterFactory(null);
         jsonWriter = factory.createWriter(os);
         */
        jsonWriter.writeObject(empJsonObject);
        jsonWriter.close();
    }
    public static Employee createEmployee() {

        Employee emp = new Employee(1,"fname1","lname1",30,"employee",10000,"marketingManager","SalesAndMarketing");

        return emp;
    }

}

