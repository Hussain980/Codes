package com.java8;

import java.util.function.Consumer;

// Consumer interface accepts single argument and return no result
// it contains accept method public void accept(T t)
public class ConsumerExample {
   public static void main(String[] args) {
	Consumer<String> c = s->System.out.println(s);
	c.accept("Hussain");
}
}
