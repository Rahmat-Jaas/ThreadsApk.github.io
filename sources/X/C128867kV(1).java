package X;

import android.util.SparseArray;
import com.facebook.graphql.calls.GQLCallInputCInputShape1S0000000;
import com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.7kV  reason: invalid class name and case insensitive filesystem */
public final class C128867kV implements C145368kO {
    public static GQLCallInputCInputShape1S0000000 A00(SparseArray sparseArray) {
        GQLCallInputCInputShape1S0000000 gQLCallInputCInputShape1S0000000 = new GQLCallInputCInputShape1S0000000();
        Object obj = sparseArray.get(22);
        obj.getClass();
        gQLCallInputCInputShape1S0000000.A0D((String) obj, "logging_id");
        gQLCallInputCInputShape1S0000000.A0D(C03480Iw.A00().toString(), "client_mutation_id");
        return gQLCallInputCInputShape1S0000000;
    }

    public final C145388kQ Cc3(SparseArray sparseArray, C113806sA r8) {
        McB mcB = C103226Yh.A00;
        String str = (String) C86124wJ.A0k(sparseArray, 12);
        try {
            C126517fN r3 = (C126517fN) C86104wH.A0p("create", C116386wt.class);
            GQLCallInputCInputShape1S0000000 A00 = A00(sparseArray);
            A00.A0D(str, "email_id");
            C86154wM.A1M(A00);
            r3.A00.A02(A00, "data");
            r3.A02 = true;
            return C92935kG.A00(r8, C1370385p.A00(), r3.AB4(), C86164wN.A0N(14), mcB);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C86114wI.A0k(e);
        }
    }

    public final C145388kQ Ch4(SparseArray sparseArray, C113806sA r10) {
        C85754vi r2;
        FBPayIGGraphQLQueryExecutor fBPayIGGraphQLQueryExecutor;
        int i;
        Object obj = sparseArray.get(12);
        McB mcB = C103226Yh.A00;
        boolean z = true;
        String str = (String) C86124wJ.A0k(sparseArray, 1);
        if (obj == null) {
            if (sparseArray.get(3) == null || !AnonymousClass0wJ.A1X(sparseArray.get(3))) {
                z = false;
            }
            try {
                C126457fH r6 = (C126457fH) C86104wH.A0p("create", C116296wk.class);
                GQLCallInputCInputShape1S0000000 A00 = A00(sparseArray);
                A00.A0C("is_default", Boolean.valueOf(z));
                C86154wM.A1M(A00);
                A00.A0D(str, "user_input_email_address");
                r6.A00.A02(A00, "data");
                r6.A02 = true;
                r2 = r6.AB4();
                fBPayIGGraphQLQueryExecutor = C1370385p.A00();
                i = 12;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw C86114wI.A0k(e);
            }
        } else {
            String str2 = (String) C86124wJ.A0k(sparseArray, 12);
            if (sparseArray.get(3) == null || !AnonymousClass0wJ.A1X(sparseArray.get(3))) {
                z = false;
            }
            try {
                C126597fV r3 = (C126597fV) C86104wH.A0p("create", C116496x4.class);
                GQLCallInputCInputShape1S0000000 A002 = A00(sparseArray);
                A002.A0D(str2, "email_id");
                A002.A0C("is_default", Boolean.valueOf(z));
                C86154wM.A1M(A002);
                A002.A0D(str, "user_input_email_address");
                r3.A00.A02(A002, "data");
                r3.A02 = true;
                r2 = r3.AB4();
                fBPayIGGraphQLQueryExecutor = C1370385p.A00();
                i = 13;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                throw C86114wI.A0k(e2);
            }
        }
        return C92935kG.A00(r10, fBPayIGGraphQLQueryExecutor, r2, C86164wN.A0N(i), mcB);
    }
}
