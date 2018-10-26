import java.util.*;
class Player{
	int jn;
	String name;
	String team;
	int age;
	
	Player(int jn,String n,String team,int age)
	{
		this.jn=jn;
		this.name=n;
		this.team=team;
		this.age=age;
	}
}

public class MapDemo {
	
	public static void main(String []args)
	{
		Player p1=new Player(7, "Cristano", "portugal", 24);
		Player p2=new Player(10, "Neymar", "Brazil", 28);
		Player p3=new Player(17, "Virat", "India", 25);
		
		Map<Integer,Player> m=new HashMap<Integer,Player>(); 
		m.put(1,p1);
		m.put(2,p2);
		m.put(3,p3);
		
		for (Integer k : m.keySet()) {
			
			System.out.println("key="+k);
			Player p=m.get(k);
			System.out.println("player="+p.name);
		}
		
	}
}	
	
