package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0Fg  reason: invalid class name and case insensitive filesystem */
public final class C03290Fg {
    public int A00;
    public ArrayList A01;
    public List A02;

    public final synchronized void A00() {
        this.A00--;
    }

    public C03290Fg() {
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        this.A02 = Collections.unmodifiableList(arrayList);
    }
}
