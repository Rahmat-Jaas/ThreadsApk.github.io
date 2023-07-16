package X;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.3jK  reason: invalid class name and case insensitive filesystem */
public final class C64023jK implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public C64023jK(Context context, String str, String str2, String str3, String str4) {
        this.A02 = str;
        this.A00 = context;
        this.A04 = str2;
        this.A01 = str3;
        this.A03 = str4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean equals = this.A02.equals("get-directions");
        Context context = this.A00;
        String str = this.A04;
        String str2 = this.A01;
        String str3 = this.A03;
        if (equals) {
            C10650ih.A0B(context, C62933bA.A00(context, AnonymousClass006.A01, C62933bA.A01(str, str2, str3)));
            return;
        }
        C62933bA.A04(context, str, str2, str3);
    }
}
