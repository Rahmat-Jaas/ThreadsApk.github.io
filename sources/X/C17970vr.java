package X;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0vr  reason: invalid class name and case insensitive filesystem */
public final class C17970vr {
    public final int A00;
    public final C04730Ow A01;
    public final C04730Ow A02;
    public final C04730Ow A03;

    public static void A02(C04730Ow r4, ObjectOutputStream objectOutputStream) {
        if (r4 == null) {
            objectOutputStream.writeInt(0);
            return;
        }
        int size = r4.size();
        objectOutputStream.writeInt(size);
        for (int i = 0; i < size; i++) {
            int keyAt = r4.keyAt(i);
            int valueAt = r4.valueAt(i);
            objectOutputStream.writeInt(keyAt);
            objectOutputStream.writeInt(valueAt);
        }
    }

    public C17970vr(C04730Ow r1, C04730Ow r2, C04730Ow r3, int i) {
        this.A00 = i;
        this.A03 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public static C17970vr A00(ObjectInputStream objectInputStream, AtomicReference atomicReference) {
        int readInt = objectInputStream.readInt();
        if (atomicReference.get() != null) {
            return null;
        }
        C04730Ow A012 = A01(objectInputStream);
        if (atomicReference.get() != null) {
            return null;
        }
        C04730Ow A013 = A01(objectInputStream);
        if (atomicReference.get() == null) {
            return new C17970vr(A012, A013, A01(objectInputStream), readInt);
        }
        return null;
    }

    public static C04730Ow A01(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        if (readInt <= 0) {
            return null;
        }
        C12380ln r3 = new C12380ln(readInt);
        int i = 0;
        do {
            r3.put(objectInputStream.readInt(), objectInputStream.readInt());
            i++;
        } while (i < readInt);
        return r3;
    }
}
