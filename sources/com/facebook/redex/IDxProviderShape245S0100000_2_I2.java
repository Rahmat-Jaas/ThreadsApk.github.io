package com.facebook.redex;

import X.AnonymousClass00U;
import X.AnonymousClass3J5;
import X.AnonymousClass51B;
import X.AnonymousClass5jM;
import X.AnonymousClass750;
import X.AnonymousClass77R;
import X.AnonymousClass7D8;
import X.AnonymousClass7ED;
import X.AnonymousClass7HK;
import X.C04560Oe;
import X.C106066eR;
import X.C106106eV;
import X.C106146eZ;
import X.C111906oc;
import X.C115266um;
import X.C11660kZ;
import X.C1193474t;
import X.C121437Gd;
import X.C121787Id;
import X.C129237lY;
import X.C133007uu;
import X.C133017uv;
import X.C13320nQ;
import X.C18180wK;
import X.C25812DsR;
import X.C27927Evd;
import X.C28279F7r;
import X.C62793ak;
import X.C86014w8;
import X.C86134wK;
import X.C91315g2;
import X.C97396Be;
import X.HDS;
import X.HDT;
import android.app.Application;
import android.content.Context;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;
import java.lang.ref.Reference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class IDxProviderShape245S0100000_2_I2 implements C04560Oe {
    public Object A00;
    public final int A01;

    public IDxProviderShape245S0100000_2_I2(Context context, int i) {
        this.A01 = i;
        switch (i) {
            case 4:
            case 10:
            case 13:
            case 14:
            case 15:
            case LangUtils.HASH_SEED /*17*/:
                this.A00 = context;
                return;
            default:
                this.A00 = context;
                return;
        }
    }

    public final /* bridge */ /* synthetic */ Object get() {
        C86014w8 r0;
        C121787Id r2;
        C25812DsR A0O;
        C27927Evd evd;
        switch (this.A01) {
            case 0:
                return new AnonymousClass5jM((C04560Oe) this.A00);
            case 1:
                return new C1193474t((Map) ((C04560Oe) this.A00).get());
            case 2:
                C11660kZ r02 = (C11660kZ) ((Reference) this.A00).get();
                if (r02 != null) {
                    return r02.B1d();
                }
                return null;
            case 3:
                return AnonymousClass3J5.A00((C62793ak) this.A00);
            case 4:
                Context context = (Context) this.A00;
                synchronized (AnonymousClass7D8.class) {
                    AnonymousClass7D8.A00();
                    r0 = AnonymousClass7D8.A01;
                }
                C115266um r4 = (C115266um) r0.get();
                if (context.getApplicationContext() instanceof Application) {
                    Application application = (Application) context.getApplicationContext();
                    AtomicReference atomicReference = C129237lY.A00;
                    if (atomicReference.get() == null) {
                        C129237lY r22 = new C129237lY();
                        if (atomicReference.compareAndSet((Object) null, r22)) {
                            BackgroundDetector.A00(application);
                            BackgroundDetector backgroundDetector = BackgroundDetector.A04;
                            synchronized (backgroundDetector) {
                                backgroundDetector.A01.add(r22);
                            }
                        }
                    }
                }
                String trim = "[DEFAULT]".trim();
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                synchronized (C121787Id.A09) {
                    Map map = C121787Id.A0A;
                    C13320nQ.A07(C18180wK.A1W(map.containsKey(trim) ? 1 : 0), AnonymousClass00U.A0V("FirebaseApp name ", trim, " already exists!"));
                    C13320nQ.A02(context, "Application context cannot be null.");
                    r2 = new C121787Id(context, r4, trim);
                    map.put(trim, r2);
                }
                C121787Id.A02(r2);
                return r2;
            case 5:
                A0O = C86134wK.A0O();
                A0O.A0D(HDT.A27);
                A0O.A06 = true;
                evd = (HDT) this.A00;
                break;
            case 6:
                C28279F7r f7r = (C28279F7r) this.A00;
                return new AnonymousClass51B(f7r, f7r.A0K);
            case 7:
                C25812DsR A0O2 = C86134wK.A0O();
                A0O2.A06 = true;
                A0O2.A0E((HDS) this.A00);
                A0O2.A09(0.0d);
                return A0O2;
            case 8:
                return new AnonymousClass750((UserSession) this.A00);
            case 9:
                return new C106066eR((UserSession) this.A00);
            case 10:
                return new C91315g2();
            case 11:
                return new C106106eV((C121437Gd) this.A00);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new AnonymousClass7HK((UserSession) this.A00);
            case 13:
                throw C97396Be.A00("Not yet implemented");
            case 14:
                return new C106146eZ((Context) this.A00);
            case 15:
                return new C111906oc((Context) this.A00);
            case 16:
                return new AnonymousClass77R((UserSession) this.A00);
            case LangUtils.HASH_SEED /*17*/:
                return new AnonymousClass7ED(((Context) this.A00).getApplicationContext());
            case 18:
                return new C133017uv((Context) this.A00);
            case 19:
                return new C133007uu((Context) this.A00);
            default:
                A0O = C86134wK.A0O();
                A0O.A06 = true;
                evd = ((EyedropperColorPickerTool) this.A00).A06;
                break;
        }
        A0O.A0E(evd);
        return A0O;
    }

    public IDxProviderShape245S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
