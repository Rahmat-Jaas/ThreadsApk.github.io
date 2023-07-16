package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.common.dextricks.DexStore;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.util.TimeZone;

/* renamed from: X.2Ij  reason: invalid class name and case insensitive filesystem */
public final class C34132Ij {
    public static final Object A00(AnonymousClass601 r9, C63893iY r10) {
        long j;
        int i;
        Resources resources;
        int i2;
        boolean A1Z = AnonymousClass0wJ.A1Z(r10, r9);
        Object A0B = C63893iY.A0B(r10, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.Number");
        long A08 = C18190wL.A08(A0B);
        long A082 = C18190wL.A08(C63893iY.A0C(r10, "null cannot be cast to non-null type kotlin.Number", A1Z ? 1 : 0));
        AnonymousClass3HX r8 = r9.A00;
        if (r8 == null) {
            return null;
        }
        if (A082 == 0) {
            j = System.currentTimeMillis();
        } else {
            j = A08 * ((long) 1000);
        }
        long offset = (j - ((((long) TimeZone.getDefault().getOffset(j)) + j) % ((long) DexStore.DAYS_TO_MS_FACTOR))) / 1000;
        Context context = r8.A00;
        if (A082 == 0) {
            A082 = offset + 604800;
        }
        C04220Ms.A06(context);
        long j2 = A082 - offset;
        float f = (float) (j2 / 604800);
        if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            resources = context.getResources();
            i2 = R.plurals.limited_interactions_reminder_date_week;
            i = (int) Math.ceil((double) f);
        } else {
            i = (int) (j2 / SandboxRepository.CACHE_TTL);
            Integer valueOf = Integer.valueOf(i);
            if (i <= 0 || valueOf == null) {
                i = 0;
            }
            resources = context.getResources();
            i2 = R.plurals.limited_interactions_reminder_date_day;
        }
        String A0m = AnonymousClass0wJ.A0m(resources, i, i2);
        C04220Ms.A06(A0m);
        return A0m;
    }
}
