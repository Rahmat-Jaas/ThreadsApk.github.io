package X;

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0sK  reason: invalid class name and case insensitive filesystem */
public final class C16010sK {
    public static C16050sO A00(Context context, String str) {
        int i = C15980sH.A00(context, str).applicationInfo.uid;
        List unmodifiableList = Collections.unmodifiableList(Arrays.asList(new String[]{str}));
        return new C16050sO(C15980sH.A02(context, (String[]) unmodifiableList.toArray(new String[0])), (String) null, (String) null, unmodifiableList, i);
    }
}
