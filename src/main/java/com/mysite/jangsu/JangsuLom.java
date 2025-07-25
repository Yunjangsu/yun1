package com.mysite.jangsu;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class JangsuLom {
    private final String hello;
    private final int lombok;

    public static void main(String[] args) {
        JangsuLom yjs = new JangsuLom("헬로", 5);
        System.out.println(yjs.getHello());
        System.out.println(yjs.getLombok());
}
}
