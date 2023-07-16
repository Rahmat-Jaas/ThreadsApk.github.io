package X;

import com.facebook.redex.IDxPredicateShape351S0100000_1_I2;
import java.io.File;
import java.io.IOException;
import java.util.Set;

/* renamed from: X.1mf  reason: invalid class name and case insensitive filesystem */
public final class C25181mf extends AnonymousClass0gG {
    public final /* synthetic */ EFO A00;
    public final /* synthetic */ Set A01;
    public final /* synthetic */ Set A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25181mf(EFO efo, Set set, Set set2) {
        super(96, 5, false, false);
        this.A00 = efo;
        this.A02 = set;
        this.A01 = set2;
    }

    public final void run() {
        File[] listFiles;
        try {
            File A012 = this.A00.A01();
            Set set = this.A02;
            Set set2 = this.A01;
            if (A012.exists() && (listFiles = A012.listFiles()) != null) {
                for (File file : listFiles) {
                    if (!file.isDirectory()) {
                        file.delete();
                    } else if (!set.contains(file.getName())) {
                        AnonymousClass0hL.A02(new IDxPredicateShape351S0100000_1_I2(set2, 1), file.getPath(), (Set) null);
                    }
                }
            }
        } catch (IOException unused) {
        }
    }
}
