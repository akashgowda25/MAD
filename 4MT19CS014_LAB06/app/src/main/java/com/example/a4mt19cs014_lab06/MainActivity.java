package com.example.a4mt19cs014_lab06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;


public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.bjson);
        b2=findViewById(R.id.bxml);
        t1=findViewById(R.id.tv1);
        t2=findViewById(R.id.tv2);

    }
    public void parsejson(View view){
       String json;
       StringBuilder sb=new StringBuilder();
       try {
           InputStream is=getAssets().open("city.json");
           int size=is.available();
           byte[] buffer=new byte[size];
           is.read(buffer);
           json=new String(buffer, StandardCharsets.UTF_8);
           JSONArray jsonArray=new JSONArray(json);
           sb.append("JSON DATA");
           sb.append("----------");
           for(int i=0;i<jsonArray.length();i++) {
               JSONObject jsonObject = JSONArray.getJSONObject(i);
               sb.append("NAME:").append(jsonObject.getString("name"));
           }t1.setText(sb.toString());
           }
       catch (Exception e)
       {
           e.printStackTrace();
           Toast.makeText(ma)

       }
       }



    }
    public void parsexml(View view){
        try {

            InputStream is = getAssets().open("city.json");
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(is);
            StringBuilder stringBuilder = new StringBuilder();
            NodeList nodeList = document.getElementsByTagName("place");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    stringBuilder.append("name").append(getValue("name", element));
                }
            }
        }
    private String getValue(String tag,Element element){
            return element.getE
        }
    }

