package X;

import com.facebook.graphql.impls.FBPayUserFacingErrorFragmentImpl;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.88i  reason: invalid class name and case insensitive filesystem */
public class C1373788i extends RuntimeException {
    public final int A00;
    public final String A01;
    public final String A02;

    public static C1373788i A00(TreeJNI treeJNI, Class cls) {
        return new C1373788i(treeJNI.getTreeValue("payments_error", cls).reinterpret(FBPayUserFacingErrorFragmentImpl.class).getIntValue(TraceFieldType.ErrorCode), "", "Payment Error");
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("Code: ");
        A0s.append(this.A00);
        A0s.append("Title: ");
        A0s.append(this.A02);
        A0s.append("Description: ");
        return C18180wK.A0i(this.A01, A0s);
    }

    public C1373788i(int i, String str, String str2) {
        super(str2);
        this.A00 = i;
        this.A02 = str;
        this.A01 = str2;
    }
}
