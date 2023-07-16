package X;

import java.io.File;

/* renamed from: X.7zD  reason: invalid class name and case insensitive filesystem */
public final class C135307zD implements Runnable {
    public final /* synthetic */ String A00;

    public C135307zD(String str) {
        this.A00 = str;
    }

    public final void run() {
        File A0Z = C86144wL.A0Z(this.A00);
        if (A0Z.exists() && A0Z.getParent() != null) {
            File A0Z2 = C86144wL.A0Z(A0Z.getParent());
            if (A0Z2.exists() && A0Z2.isDirectory()) {
                File[] listFiles = A0Z2.listFiles();
                if (listFiles != null) {
                    for (File delete : listFiles) {
                        delete.delete();
                    }
                }
                A0Z2.delete();
            }
        }
    }
}
