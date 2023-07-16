package X;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape156S0100000_I2_11;

/* renamed from: X.3Dd  reason: invalid class name and case insensitive filesystem */
public abstract class C57943Dd {
    public final CharSequence A01(Resources resources) {
        String quantityString;
        if (this instanceof AnonymousClass1kC) {
            AnonymousClass1kC r1 = (AnonymousClass1kC) this;
            C04220Ms.A0B(resources, 0);
            Object[] objArr = r1.A01;
            int length = objArr.length;
            if (length == 0) {
                quantityString = resources.getString(r1.A00);
            } else {
                quantityString = resources.getString(r1.A00, Arrays.copyOf(objArr, length));
            }
        } else if (this instanceof AnonymousClass1kB) {
            return ((AnonymousClass1kB) this).A00;
        } else {
            if (this instanceof AnonymousClass1k9) {
                AnonymousClass1k9 r4 = (AnonymousClass1k9) this;
                C04220Ms.A0B(resources, 0);
                Object[] objArr2 = r4.A02;
                int length2 = objArr2.length;
                if (length2 == 0) {
                    quantityString = resources.getQuantityString(r4.A01, r4.A00);
                } else {
                    quantityString = resources.getQuantityString(r4.A01, r4.A00, Arrays.copyOf(objArr2, length2));
                }
            } else {
                C04220Ms.A0B(resources, 0);
                List list = ((AnonymousClass1kA) this).A00;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                AnonymousClass00J.A0g(spannableStringBuilder, "", "", "", "...", list, new KtLambdaShape156S0100000_I2_11(resources, 15), -1);
                return spannableStringBuilder;
            }
        }
        C04220Ms.A06(quantityString);
        return quantityString;
    }
}
