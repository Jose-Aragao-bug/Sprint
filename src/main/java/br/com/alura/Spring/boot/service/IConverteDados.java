package br.com.alura.Spring.boot.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}