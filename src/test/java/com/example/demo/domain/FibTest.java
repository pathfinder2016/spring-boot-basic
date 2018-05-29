package com.example.demo.domain;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FibTest {

    @Test
    public void should_return_1_when_query_index_is_1(){
        Fib fib = new Fib();
        int fibValue = fib.queryValueByIndex(1);
        assertThat(fibValue).isEqualTo(1);
    }

    @Test
    public void should_return_1_when_query_index_is_2(){
        Fib fib = new Fib();
        int fibValue = fib.queryValueByIndex(2);
        assertThat(fibValue).isEqualTo(1);
    }

    @Test
    public void should_return_2_when_query_index_is_3(){
        Fib fib = new Fib();
        int fibValue = fib.queryValueByIndex(3);
        assertThat(fibValue).isEqualTo(2);
    }

    @Test
    public void should_return_21_when_query_index_is_8(){
        Fib fib = new Fib();
        int fibValue = fib.queryValueByIndex(8);
        assertThat(fibValue).isEqualTo(21);
    }

    @Test
    public void should_return_1_when_query_index_is_minus_1(){
        Fib fib = new Fib();
        int fibValue = fib.queryValueByIndex(-1);
        assertThat(fibValue).isEqualTo(0);
    }


}
