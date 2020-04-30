package com.rajendarreddyj.java14.preview.jep370;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryHandles;
import jdk.incubator.foreign.MemorySegment;

import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;

/**
 * JEP 370: Foreign-Memory Access API (Incubator)
 * An incubator module, allow Java API to access foreign memory outside of the Java heap.
 * --add-modules jdk.incubator.foreign
 */
public class Jep370Feature {
    public static void main(String[] args) {
        VarHandle intHandle = MemoryHandles.varHandle(int.class, ByteOrder.nativeOrder());
        try (MemorySegment segment = MemorySegment.allocateNative(1024)) {
            MemoryAddress base = segment.baseAddress();
            System.out.println(base);                 // print memory address
            intHandle.set(base, 999);                 // set value 999 into the foreign memory
            System.out.println(intHandle.get(base));  // get the value from foreign memory
        }
        VarHandle intHandle1 = MemoryHandles.varHandle(int.class, ByteOrder.BIG_ENDIAN);

        try (MemorySegment segment = MemorySegment.allocateNative(10 * 4)) {
            MemoryAddress base = segment.baseAddress();
            System.out.println(base);
            for (long i = 0 ; i < 10 ; i++) {
                intHandle1.set(base.addOffset(i * 4), (int)i);
                System.out.println(intHandle1.get(base));
            }
        }
    }
}
