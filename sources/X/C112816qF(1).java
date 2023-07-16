package X;

import android.content.SharedPreferences;
import com.facebook.cameracore.ardelivery.xplatcache.ARDFileCache;
import com.facebook.redex.IDxFCallbackShape114S0200000_2_I2;
import com.google.common.collect.ImmutableList;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;

/* renamed from: X.6qF  reason: invalid class name and case insensitive filesystem */
public final class C112816qF {
    public final ARDFileCache A00;
    public final C132157tR A01;
    public final AnonymousClass0IB A02;
    public final C113896sL A03;
    public final C83304rA A04;

    public final void A00(AnonymousClass22X r7) {
        SharedPreferences.Editor putBoolean;
        C04220Ms.A0B(r7, 0);
        AnonymousClass22X r1 = AnonymousClass22X.WITHDRAWN;
        C132157tR r0 = this.A01;
        if (r7 != r1) {
            putBoolean = r0.A00.edit().remove("flmEffectsDeleted");
        } else {
            SharedPreferences sharedPreferences = r0.A00;
            if (!sharedPreferences.getBoolean("flmEffectsDeleted", false)) {
                Set allKeys = this.A00.getAllKeys();
                C04220Ms.A06(allKeys);
                if (allKeys.isEmpty()) {
                    putBoolean = sharedPreferences.edit().putBoolean("flmEffectsDeleted", true);
                } else {
                    ImmutableList A0S = C18220wO.A0S(allKeys);
                    try {
                        C126237ep r2 = (C126237ep) C86104wH.A0p("create", C116216wc.class);
                        r2.A00.A06("effect_ids", A0S);
                        r2.A02 = true;
                        C146418mD build = r2.build();
                        C04220Ms.A06(build);
                        build.setMaxToleratedCacheAgeMs(StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                        build.setFreshCacheAgeMs(StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                        this.A04.AMA(build, new IDxFCallbackShape114S0200000_2_I2(0, this, allKeys));
                        return;
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                        throw C86114wI.A0k(e);
                    }
                }
            } else {
                return;
            }
        }
        putBoolean.apply();
    }

    public C112816qF(C113896sL r3, ARDFileCache aRDFileCache, C132157tR r5, AnonymousClass0IB r6, C83304rA r7) {
        this.A03 = r3;
        this.A01 = r5;
        this.A04 = r7;
        this.A00 = aRDFileCache;
        this.A02 = r6;
        r3.A01.add(C86114wI.A0Q(this, 13));
        AnonymousClass22X r1 = r3.A04;
        r1 = r1 == null ? AnonymousClass22X.UNSET_OR_UNRECOGNIZED_ENUM_VALUE : r1;
        if (r1 == AnonymousClass22X.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) {
            r3.A00();
        } else {
            A00(r1);
        }
    }
}
