package X;

import com.instagram.api.schemas.StoryTrendingPromptSubType;
import java.util.List;

/* renamed from: X.5LC  reason: invalid class name */
public final class AnonymousClass5LC extends AnonymousClass0Sf implements C144388iI {
    public final StoryTrendingPromptSubType A00;
    public final List A01;

    public AnonymousClass5LC(StoryTrendingPromptSubType storyTrendingPromptSubType, List list) {
        C04220Ms.A0B(list, 1);
        this.A01 = list;
        this.A00 = storyTrendingPromptSubType;
    }

    public final AnonymousClass5LC D2T() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5LC) {
                AnonymousClass5LC r5 = (AnonymousClass5LC) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18210wN.A04(this.A01) + AnonymousClass0wJ.A03(this.A00);
    }
}
