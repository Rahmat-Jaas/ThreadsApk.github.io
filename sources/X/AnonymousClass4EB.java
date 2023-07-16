package X;

import com.instagram.barcelona.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* renamed from: X.4EB  reason: invalid class name */
public final class AnonymousClass4EB implements C84694ti {
    public final Integer A00;
    public final List A01;
    public final Map A02;

    public AnonymousClass4EB(Integer num) {
        this.A00 = num;
        AnonymousClass2AP r8 = AnonymousClass2AP.A0E;
        Pair A10 = AnonymousClass0wJ.A10(r8, R.plurals.chat_badge);
        AnonymousClass2AP r7 = AnonymousClass2AP.A0D;
        Pair A102 = AnonymousClass0wJ.A10(r7, R.plurals.comment_badge);
        AnonymousClass2AP r5 = AnonymousClass2AP.A0W;
        Pair A103 = AnonymousClass0wJ.A10(r5, R.plurals.follow_badge);
        AnonymousClass2AP r3 = AnonymousClass2AP.A0M;
        Pair A104 = AnonymousClass0wJ.A10(r3, R.plurals.like_badge);
        AnonymousClass2AP r1 = AnonymousClass2AP.A0O;
        this.A02 = AnonymousClass4WJ.A0H(A10, A102, A103, A104, AnonymousClass0wJ.A10(r1, R.plurals.new_post_badge));
        this.A01 = C06750aI.A17(r8, r7, r5, r3, r1);
    }
}
