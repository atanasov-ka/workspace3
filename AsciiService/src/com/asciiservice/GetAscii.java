package com.asciiservice;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.xml.stream.util.StreamReaderDelegate;

import org.omg.CORBA.Request;

import com.asciiplayer.PicturePlayer;
import com.asciiplayer.Player;
import com.asciiplayer.PlayerUtils;


/**
 * Servlet implementation class GetAscii
 */
@WebServlet("/GetAscii")
public class GetAscii extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAscii() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().write("Hello World!");
		
		URL url = new URL(request.getParameter("file"));
	    Image image = ImageIO.read(url);
	    
	    
	}
	
	private String getFileName(final Part part) {
	    final String partHeader = part.getHeader("content-disposition");
	    
	    for (String content : part.getHeader("content-disposition").split(";")) {
	        if (content.trim().startsWith("filename")) {
	            return content.substring(
	                    content.indexOf('=') + 1).trim().replace("\"", "");
	        }
	    }
	    return null;
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		// TODO
	    //final String fileName = getFileName(filePart);
	    //BufferedImage bufImage = new BufferedInputStream(( new BufferedInputStream(filePart.getInputStream())).getInputStream()); 
	    //filePart.getInputStream().
	    
		//String result = PlayerUtils.stringify(image, columns)y(image, 100);
		//resp.getWriter().write(result);
		
	}

}
