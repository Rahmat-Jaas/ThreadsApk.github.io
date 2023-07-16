package X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.3Ny  reason: invalid class name and case insensitive filesystem */
public final class C60163Ny {
    public static C28221tt parseFromJson(MMo mMo) {
        return (C28221tt) AnonymousClass0wJ.A0h(mMo, 119);
    }

    public static void A00(MMp mMp, C28221tt r5) {
        mMp.A0J();
        if (r5.A09 != null) {
            mMp.A0U(DialogModule.KEY_TITLE);
            C28251tw r0 = r5.A09;
            mMp.A0J();
            String str = r0.A00;
            if (str != null) {
                mMp.A0d("text", str);
            }
            mMp.A0G();
        }
        if (r5.A03 != null) {
            mMp.A0U("content");
            C28231tu r02 = r5.A03;
            mMp.A0J();
            String str2 = r02.A00;
            if (str2 != null) {
                mMp.A0d("text", str2);
            }
            mMp.A0G();
        }
        if (r5.A05 != null) {
            mMp.A0U("footer");
            C28241tv r03 = r5.A05;
            mMp.A0J();
            String str3 = r03.A00;
            if (str3 != null) {
                mMp.A0d("text", str3);
            }
            mMp.A0G();
        }
        if (r5.A01 != null) {
            mMp.A0U("primary_action");
            C60143Nw.A00(mMp, r5.A01);
        }
        if (r5.A02 != null) {
            mMp.A0U("secondary_action");
            C60143Nw.A00(mMp, r5.A02);
        }
        if (r5.A07 != null) {
            mMp.A0U("image");
            AnonymousClass3O0.A00(mMp, r5.A07);
        }
        if (r5.A06 != null) {
            mMp.A0U("dark_mode_image");
            AnonymousClass3O0.A00(mMp, r5.A06);
        }
        if (r5.A00 != null) {
            mMp.A0U("dismiss_action");
            C60143Nw.A00(mMp, r5.A00);
        }
        if (r5.A0A != null) {
            mMp.A0U("bullet_list");
            mMp.A0I();
            for (C57203Ad r2 : r5.A0A) {
                if (r2 != null) {
                    mMp.A0J();
                    String str4 = r2.A02;
                    if (str4 != null) {
                        mMp.A0d(DialogModule.KEY_TITLE, str4);
                    }
                    String str5 = r2.A01;
                    if (str5 != null) {
                        mMp.A0d("subtitle", str5);
                    }
                    if (r2.A00 != null) {
                        mMp.A0U("icon");
                        AnonymousClass3O0.A00(mMp, r2.A00);
                    }
                    mMp.A0G();
                }
            }
            mMp.A0F();
        }
        if (r5.A08 != null) {
            mMp.A0U("social_context");
            C560135l r04 = r5.A08;
            mMp.A0J();
            String str6 = r04.A00;
            if (str6 != null) {
                mMp.A0d("text", str6);
            }
            mMp.A0G();
        }
        if (r5.A0C != null) {
            mMp.A0U("social_context_images");
            mMp.A0I();
            for (AnonymousClass3TA r05 : r5.A0C) {
                if (r05 != null) {
                    AnonymousClass3O0.A00(mMp, r05);
                }
            }
            mMp.A0F();
        }
        if (r5.A04 != null) {
            mMp.A0U("bloks_payload");
            C559735h r1 = r5.A04;
            mMp.A0J();
            if (r1.A00 != null) {
                mMp.A0U("layout");
                C95255zj.A01.A01(mMp, r1.A00.A00);
            }
            mMp.A0G();
        }
        if (r5.A0B != null) {
            mMp.A0U("story_bucket_generated_cards");
            mMp.A0I();
            for (C568138q r22 : r5.A0B) {
                if (r22 != null) {
                    mMp.A0J();
                    if (r22.A00 != null) {
                        mMp.A0U("ig_guide");
                        C559835i r06 = r22.A00;
                        mMp.A0J();
                        String str7 = r06.A00;
                        if (str7 != null) {
                            mMp.A0d("id", str7);
                        }
                        mMp.A0G();
                    }
                    if (r22.A01 != null) {
                        mMp.A0U("ig_media");
                        C559935j r07 = r22.A01;
                        mMp.A0J();
                        String str8 = r07.A00;
                        if (str8 != null) {
                            mMp.A0d("instagram_media_id", str8);
                        }
                        mMp.A0G();
                    }
                    mMp.A0G();
                }
            }
            mMp.A0F();
        }
        AnonymousClass3Za.A00(mMp, r5);
        mMp.A0G();
    }
}
