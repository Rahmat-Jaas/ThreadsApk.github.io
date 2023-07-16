package X;

import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;

/* renamed from: X.0lX  reason: invalid class name and case insensitive filesystem */
public final class C12220lX implements AnonymousClass0WU {
    public final AnonymousClass0Jz A00;

    public static void A00(ObjectOutputStream objectOutputStream, LinkedHashMap linkedHashMap) {
        if (linkedHashMap == null) {
            objectOutputStream.writeShort(0);
            return;
        }
        objectOutputStream.writeShort(linkedHashMap.size());
        for (String writeUTF : linkedHashMap.keySet()) {
            objectOutputStream.writeUTF(writeUTF);
        }
    }

    public final int AMf(int i, String str) {
        LinkedHashMap linkedHashMap;
        Number number;
        AnonymousClass0w0 r0 = (AnonymousClass0w0) this.A00.get(i);
        if (r0 == null || (linkedHashMap = r0.A00) == null || (number = (Number) linkedHashMap.get(str)) == null) {
            return -1;
        }
        return number.intValue();
    }

    public final boolean BVq(int i) {
        if (this.A00.get(i) != null) {
            return true;
        }
        return false;
    }

    public C12220lX(AnonymousClass0Jz r1) {
        this.A00 = r1;
    }
}
