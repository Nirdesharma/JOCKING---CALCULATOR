package MyPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */
public class MyCalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String[] jokes = {
	        "Why do Java developers wear glasses? Because they don't C#!",
	        "I told my computer I needed a break, and now it won't stop sending me Kit Kat bars.",
	        "Why don't programmers like nature? It has too many bugs.",
	        "How many programmers does it take to change a light bulb? None, it's a hardware problem.",
	        "What’s the smartest insect? A spelling bee!",
	        "Why are snails slow? Because they’re carrying a house on their back.",
	        "Name the kind of tree you can hold in your hand? A palm tree!",
	        "Why did the teddy bear say no to dessert? Because she was stuffed.",
	        "What’s a cat’s favorite dessert? A bowl full of mice-cream.",
	        " What did the policeman say to his hungry stomach? “Freeze. You’re under a vest.",
	        " What did the left eye say to the right eye? Between us, something smells!",
	        " What do you call a guy who’s really loud? Mike.",
	        " Why do birds fly south in the winter? It’s faster than walking!",
	        " What did the lava say to his girlfriend?I lava you!",
	        " Why did the student eat his homework? Because the teacher told him it was a piece of cake.",
	        " What did Yoda say when he saw himself in 4k? HDMI.",
	        " Which superhero hits home runs? Batman!",        
	        "What’s Thanos’ favorite app on his phone? Snapchat.",       
	         " Sandy’s mum has four kids; North, West, East. What is the name of the fourth child? Sandy, obviously!",       
	        " What is a room with no walls? A mushroom.",
	        " Why did the blue jay get in trouble at school? For tweeting on a test!",
	       	 " What social events do spiders love to attend? Webbings.",
	         " What did one pickle say to the other? Dill with it.",
	      
	        // Add more jokes here
	    };
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyCalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		String str3 = request.getParameter("bt1");
		//typecasting
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		int ans;
		
		if(str3.equals("1")) ans= a+b;
		else if(str3.equals("2")) ans=a-b;
		else if(str3.equals("3")) ans=a*b;
		else ans=a/b;
		
		 int randomIndex = (int) (Math.random() * jokes.length);
	     String randomJoke = jokes[randomIndex];
	     
		response.sendRedirect("JokingCalculator.jsp?ans="+ans+"&joke="+randomJoke);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}