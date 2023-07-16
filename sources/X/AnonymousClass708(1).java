package X;

import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.708  reason: invalid class name */
public final class AnonymousClass708 {
    public static AnonymousClass5M9 parseFromJson(MMo mMo) {
        return (AnonymousClass5M9) C86104wH.A0e(mMo, 5);
    }

    public static void A00(MMp mMp, AnonymousClass5M9 r6) {
        mMp.A0J();
        AnonymousClass5KZ r2 = r6.A02;
        if (r2 != null) {
            mMp.A0U("attribution_info");
            mMp.A0J();
            mMp.A0d("owner_username", r2.A00);
            mMp.A0d("template_media_id", r2.A01);
            mMp.A0G();
        }
        AnonymousClass5Ka r3 = r6.A03;
        if (r3 != null) {
            mMp.A0U("effects_info");
            mMp.A0J();
            Long l = r3.A00;
            if (l != null) {
                mMp.A0c("overall_effect_id", l.longValue());
            }
            List list = r3.A01;
            if (list != null) {
                Iterator A0t = C18190wL.A0t(mMp, "segment_effects_info", list);
                while (A0t.hasNext()) {
                    C90005Kb r32 = (C90005Kb) A0t.next();
                    if (r32 != null) {
                        mMp.A0J();
                        mMp.A0c("effect_id", r32.A01);
                        mMp.A0b("segment_index", r32.A00);
                        mMp.A0G();
                    }
                }
                mMp.A0F();
            }
            mMp.A0G();
        }
        Integer num = r6.A05;
        if (num != null) {
            mMp.A0b("min_num_segments", num.intValue());
        }
        Iterator A0t2 = C18190wL.A0t(mMp, "segments_info", r6.A06);
        while (A0t2.hasNext()) {
            C90015Kc r0 = (C90015Kc) A0t2.next();
            if (r0 != null) {
                mMp.A0J();
                mMp.A0c("duration_in_ms", r0.A00);
                mMp.A0G();
            }
        }
        mMp.A0F();
        AnonymousClass5KY r1 = r6.A01;
        if (r1 != null) {
            mMp.A0U("smart_template_info");
            mMp.A0J();
            mMp.A0d("effect_id", r1.A00);
            mMp.A0G();
        }
        mMp.A0c(C28174Ezk.A00(15), r6.A00);
        AnonymousClass5MA r12 = r6.A04;
        if (r12 != null) {
            mMp.A0U("timed_texts_info");
            mMp.A0J();
            Iterator A0t3 = C18190wL.A0t(mMp, "text_info_list", r12.A00);
            while (A0t3.hasNext()) {
                AnonymousClass5MB r02 = (AnonymousClass5MB) A0t3.next();
                if (r02 != null) {
                    AnonymousClass709.A00(mMp, r02);
                }
            }
            mMp.A0F();
            mMp.A0G();
        }
        List list2 = r6.A07;
        if (list2 != null) {
            Iterator A0t4 = C18190wL.A0t(mMp, "transition_effects_info", list2);
            while (A0t4.hasNext()) {
                C90025Kd r33 = (C90025Kd) A0t4.next();
                if (r33 != null) {
                    mMp.A0J();
                    mMp.A0c("duration_in_ms", r33.A00);
                    Integer num2 = r33.A02;
                    if (num2 != null) {
                        mMp.A0b("index", num2.intValue());
                    }
                    mMp.A0d(FXPFAccessLibraryDebugFragment.NAME, r33.A03);
                    mMp.A0c("start_time_in_ms", r33.A01);
                    mMp.A0G();
                }
            }
            mMp.A0F();
        }
        mMp.A0G();
    }
}
