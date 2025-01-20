package com.startdbmob.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SaudacaoTests {

  @Autowired
  private Saudacao saudacao;

  @Test
  public void testSaudacao() {
    String resultado = saudacao.saudar("Maria");
    assertEquals("Olá, Maria", resultado);
  }

  @Test 
  public void testSaudacaoSemPreencherNull() {
    String resultado = saudacao.saudar(null);

    assertEquals("Olá, você aí", resultado);
  }
  @Test 
  public void testSaudacaoSemPreencher() {
    String resultado = saudacao.saudar("");

    assertEquals("Olá, você aí", resultado);
  }

  @Test 
  public void testSaudacaoGritada() {
    String resultado = saudacao.saudar("MARIA");

    assertEquals("OLÁ, MARIA!!!", resultado);
  }

  @Test
  public void testSaudacaoComDoisNomes() {
    List<String> nomes = new ArrayList<>();
    nomes.add("Maria");
    nomes.add("Nina");
    String resultado = saudacao.saudarComposto(nomes);

    assertEquals("Olá, Maria e Nina", resultado);
  }

  //Em construcao
}
