package X;

import android.content.Context;
import com.fbpay.hub.common.link.LinkParams;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.6Il  reason: invalid class name and case insensitive filesystem */
public final class C99186Il {
    public static C112166p6 A00(Context context, ImmutableList immutableList, String str) {
        int i;
        int i2;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (int i3 = 0; i3 < immutableList.size(); i3++) {
            if (((LinkParams) immutableList.get(i3)).A01 != 0) {
                str = str.replace(((LinkParams) immutableList.get(i3)).A03, context.getString(((LinkParams) immutableList.get(i3)).A01));
            }
        }
        for (int i4 = 0; i4 < immutableList.size(); i4++) {
            int i5 = ((LinkParams) immutableList.get(i4)).A01;
            LinkParams linkParams = (LinkParams) immutableList.get(i4);
            if (i5 != 0) {
                String string = context.getString(linkParams.A01);
                i = str.indexOf(string);
                i2 = AnonymousClass2C6.A00(string);
            } else {
                i = linkParams.A02;
                i2 = ((LinkParams) immutableList.get(i4)).A00;
            }
            A0v.add(new C108886j7(i2, i, ((LinkParams) immutableList.get(i4)).A04));
        }
        return new C112166p6(str, Collections.unmodifiableList(A0v));
    }
}
