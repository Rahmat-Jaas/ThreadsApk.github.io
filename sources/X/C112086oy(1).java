package X;

import android.content.Context;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2000000_I2;
import com.facebook.redex.IDxFCallbackShape314S0100000_2_I2;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6oy  reason: invalid class name and case insensitive filesystem */
public final class C112086oy {
    public final C83304rA A00;
    public final Context A01;

    public final C143338gY A00(ImmutableList immutableList, String str) {
        C04220Ms.A0B(str, 1);
        SettableFuture settableFuture = new SettableFuture();
        try {
            C126347f0 r7 = (C126347f0) C86104wH.A0p("create", C116646xJ.class);
            C67463zb r6 = r7.A00;
            r6.A05("client_signal_metadata_version", str);
            r7.A02 = true;
            if (immutableList != null) {
                ArrayList A0w = AnonymousClass0wJ.A0w(immutableList);
                Iterator it = immutableList.iterator();
                while (it.hasNext()) {
                    KtCSuperShape0S2000000_I2 ktCSuperShape0S2000000_I2 = (KtCSuperShape0S2000000_I2) it.next();
                    GQLCallInputCInputShape0S0000000 A002 = GraphQlCallInput.A00();
                    A002.A0F(ktCSuperShape0S2000000_I2.A01, ClientCookie.VERSION_ATTR);
                    A002.A0F(ktCSuperShape0S2000000_I2.A00, "usecase");
                    A0w.add(A002);
                }
                r6.A06("usecases", C18220wO.A0S(A0w));
            }
            this.A00.AMA(r7.build(), new IDxFCallbackShape314S0100000_2_I2(settableFuture, 2));
            return (C143338gY) settableFuture.get();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C86114wI.A0k(e);
        }
    }

    public C112086oy(Context context, C83304rA r2) {
        AnonymousClass0wJ.A1O(r2, context);
        this.A00 = r2;
        this.A01 = context;
    }
}
