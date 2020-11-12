package com.neotech.review06;

public class Forest {

	public static void main(String[] args) {
Wolf a=new Wolf();
a.name="rt";
a.legs=4;
a.disp();

Fox f=new Fox(" black");
f.name="fx ";
f.legs=4;
//f.furcolor=" white";
f.fx();

Bear b=new Bear();
b.name="br ";
b.legs=2;
b.disp();
b.roar();
b.sleep();
	}

}
