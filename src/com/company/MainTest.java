package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

   @Test
   public void greeting() {assertTrue(true) ;}

   @Test
   public void msg() {

      assertEquals ("Howdy World", Main.msg("Howdy World") );

   }

}


