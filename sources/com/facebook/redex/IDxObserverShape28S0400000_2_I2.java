package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass00J;
import X.AnonymousClass066;
import X.AnonymousClass0TJ;
import X.AnonymousClass0wJ;
import X.AnonymousClass55z;
import X.AnonymousClass56V;
import X.AnonymousClass5j8;
import X.AnonymousClass77N;
import X.AnonymousClass79R;
import X.AnonymousClass7GH;
import X.AnonymousClass7Kx;
import X.AnonymousClass7Kz;
import X.AnonymousClass7j5;
import X.C04220Ms;
import X.C104926cb;
import X.C109566kD;
import X.C120967Dk;
import X.C121097Ec;
import X.C143158gC;
import X.C18180wK;
import X.C18190wL;
import X.C310423z;
import X.C63803iN;
import X.C86124wJ;
import X.C880756q;
import X.C92895kC;
import X.CKW;
import X.D6X;
import X.M5J;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.ComponentActivity;
import com.facebookpay.expresscheckout.models.PriceInfo;
import com.facebookpay.expresscheckout.models.TransactionInfo;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.KtLambdaShape11S0300000_I2_1;

public class IDxObserverShape28S0400000_2_I2 implements C143158gC {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxObserverShape28S0400000_2_I2(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A04 = i;
        this.A00 = obj3;
        this.A03 = obj2;
        this.A01 = obj4;
        this.A02 = obj;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        TransactionInfo transactionInfo;
        ArrayList<PriceInfo> arrayList;
        PriceInfo priceInfo;
        Object obj2;
        Object obj3 = obj;
        switch (this.A04) {
            case 0:
                AnonymousClass7Kx r9 = (AnonymousClass7Kx) obj3;
                C04220Ms.A07(r9);
                ((AnonymousClass7j5) this.A03).A08((AnonymousClass79R) this.A02, r9);
                if (!AnonymousClass7Kx.A0P(r9)) {
                    ((C880756q) this.A00).A0J((M5J) this.A01);
                    return;
                }
                return;
            case 1:
                AnonymousClass7Kx r92 = (AnonymousClass7Kx) obj3;
                C121097Ec A0G = AnonymousClass7Kz.A0G();
                AnonymousClass5j8 r11 = (AnonymousClass5j8) this.A03;
                ContextThemeWrapper contextThemeWrapper = r11.A00;
                if (contextThemeWrapper != null) {
                    Drawable A042 = A0G.A04(contextThemeWrapper, 35, 33);
                    boolean z = false;
                    if (!(r92 == null || (transactionInfo = (TransactionInfo) r92.A01) == null || (arrayList = transactionInfo.A08) == null || (priceInfo = (PriceInfo) AnonymousClass00J.A0C(arrayList)) == null)) {
                        TextView textView = (TextView) this.A02;
                        TextView textView2 = (TextView) this.A00;
                        ImageView imageView = (ImageView) this.A01;
                        String str = priceInfo.A03;
                        if (str != null) {
                            C92895kC r1 = new C92895kC(AnonymousClass7Kz.A0L().A00, str, "ECPNuxFormContentFragment");
                            r1.A02 = A042;
                            r1.A07 = false;
                            ContextThemeWrapper contextThemeWrapper2 = r11.A00;
                            if (contextThemeWrapper2 != null) {
                                r1.A00 = (float) C86124wJ.A08(contextThemeWrapper2);
                                r1.A02(imageView);
                                z = true;
                            }
                        }
                        textView.setText(C86124wJ.A0v(priceInfo.A00, AnonymousClass77N.A00));
                        textView2.setText(priceInfo.A04);
                        if (z) {
                            return;
                        }
                    }
                    ((ImageView) this.A01).setImageDrawable(A042);
                    return;
                }
                C04220Ms.A0E("wrapperContext");
                throw null;
            case 2:
                AnonymousClass7Kx r93 = (AnonymousClass7Kx) obj3;
                AnonymousClass55z r4 = (AnonymousClass55z) this.A00;
                r4.A00.setVisibility(C18190wL.A00(AnonymousClass7Kx.A0P(r93) ? 1 : 0));
                if (AnonymousClass7Kx.A0R(r93)) {
                    ((M5J) this.A03).A0F(this);
                    r4.AMq((Bundle) this.A02, (C120967Dk) this.A01, (Throwable) null);
                    return;
                } else if (AnonymousClass7Kx.A0O(r93)) {
                    ((M5J) this.A03).A0F(this);
                    r4.AMq((Bundle) this.A02, (C120967Dk) null, r93.A02);
                    return;
                } else {
                    return;
                }
            case 3:
                String str2 = ((C104926cb) obj3).A00;
                boolean equalsIgnoreCase = "LOCKED".equalsIgnoreCase(str2);
                TextView textView3 = (TextView) this.A03;
                int i = 2131827248;
                if (equalsIgnoreCase) {
                    i = 2131827251;
                }
                textView3.setText(i);
                int i2 = 0;
                if ("DELETED".equalsIgnoreCase(str2)) {
                    i2 = 8;
                }
                textView3.setVisibility(i2);
                ((View) this.A02).setVisibility(i2);
                ((View) this.A01).setVisibility(i2);
                return;
            case 4:
                List list = (List) obj3;
                C04220Ms.A0B(list, 0);
                AnonymousClass7GH r112 = AnonymousClass7GH.A00;
                ComponentActivity componentActivity = (ComponentActivity) this.A00;
                AnonymousClass066 r7 = (AnonymousClass066) this.A02;
                UserSession userSession = (UserSession) this.A03;
                AnonymousClass56V r5 = (AnonymousClass56V) this.A01;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        CKW ckw = (CKW) it.next();
                        if (ckw.A00()) {
                            long hours = TimeUnit.SECONDS.toHours(C18190wL.A07()) - TimeUnit.MILLISECONDS.toHours(((CKW) AnonymousClass00J.A0C(list)).A01);
                            AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
                            if (hours >= C63803iN.A03(r2, userSession, 36601286094818983L) && hours <= C63803iN.A03(r2, userSession, 36601286095015592L) && C63803iN.A0E(r2, userSession, 36319811118241214L)) {
                                Context baseContext = componentActivity.getBaseContext();
                                C04220Ms.A06(baseContext);
                                D6X.A00(baseContext, userSession, AnonymousClass006.A0C).A02(r7, ckw.A07, new KtLambdaShape11S0300000_I2_1(0, ckw, userSession, r112));
                            }
                        }
                    }
                }
                r5.A01.A0B(componentActivity);
                return;
            default:
                C109566kD r94 = (C109566kD) obj3;
                ((IgdsBottomButtonLayout) this.A01).setPrimaryActionIsLoading(r94.A02);
                Object obj4 = r94.A01;
                int ordinal = ((C310423z) obj4).ordinal();
                if (ordinal == 1) {
                    obj2 = this.A00;
                } else if (ordinal == 2) {
                    obj2 = this.A03;
                } else if (ordinal == 0) {
                    obj2 = this.A02;
                } else {
                    throw C18180wK.A0a(AnonymousClass0wJ.A0t(AnonymousClass000.A00(746), obj4));
                }
                ((CompoundButton) obj2).setChecked(true);
                return;
        }
    }
}
