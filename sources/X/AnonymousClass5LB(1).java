package X;

import com.instagram.api.schemas.StoryPromptTappableData;
import java.util.List;

/* renamed from: X.5LB  reason: invalid class name */
public final class AnonymousClass5LB extends AnonymousClass0Sf implements C144378iH {
    public final StoryPromptTappableData A00;
    public final AnonymousClass5LC A01;
    public final List A02;
    public final List A03;

    public final AnonymousClass5LB D2S(C112176p7 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5LB) {
                AnonymousClass5LB r5 = (AnonymousClass5LB) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A03, AnonymousClass0wJ.A05(this.A00, AnonymousClass0wJ.A05(this.A02, AnonymousClass0wJ.A03(this.A01) * 31)));
    }

    public AnonymousClass5LB(StoryPromptTappableData storyPromptTappableData, AnonymousClass5LC r3, List list, List list2) {
        AnonymousClass0wJ.A1Q(list, storyPromptTappableData);
        C04220Ms.A0B(list2, 4);
        this.A01 = r3;
        this.A02 = list;
        this.A00 = storyPromptTappableData;
        this.A03 = list2;
    }
}
