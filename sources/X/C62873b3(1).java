package X;

import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.debug.devoptions.cam.AnimationSpecKt;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import go.Seq;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3b3  reason: invalid class name and case insensitive filesystem */
public final class C62873b3 {
    public static /* synthetic */ void A01(C11630kW r8, UserSession userSession, Integer num) {
        C04220Ms.A0B(userSession, 0);
        A03(r8, userSession, num, (Integer) null, (Integer) null, (String) null, (String) null, (Throwable) null, (Map) null, 944);
    }

    public static final void A02(C11630kW r8, UserSession userSession, Integer num, Integer num2, Integer num3) {
        C04220Ms.A0B(userSession, 0);
        A03(r8, userSession, num, num2, num3, (String) null, (String) null, (Throwable) null, (Map) null, 688);
    }

    public static final void A04(C11630kW r11, UserSession userSession, Integer num, boolean z) {
        C04220Ms.A0B(userSession, 0);
        C11630kW r1 = r11;
        Integer num2 = num;
        A03(r1, userSession, AnonymousClass006.A0B, num2, AnonymousClass006.A00, (String) null, (String) null, (Throwable) null, AnonymousClass4WK.A0O(C18180wK.A0p("switch_on", String.valueOf(z))), 688);
    }

    public static final void A00(C11630kW r3, BKU bku, UserSession userSession, Integer num) {
        Long l;
        String str;
        String str2;
        char A1Y = AnonymousClass0wJ.A1Y(userSession, r3);
        if (bku != null) {
            String[] A4p = bku.A4p();
            C04220Ms.A06(A4p);
            if (A4p.length == 0 || (str2 = A4p[A1Y]) == null) {
                l = null;
            } else {
                l = AnonymousClass4n2.A02(str2);
            }
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r3, userSession), "ig_branded_content_event"), 823);
            if (AnonymousClass0wJ.A1U(A0I)) {
                C18230wP.A1G(A0I, "paid_partnership_label_impression");
                A0I.A0S("user_ig_id", AnonymousClass0wJ.A0d(userSession.getUserId()));
                switch (C18240wQ.A05(A0I, num, "media_id", bku.A33())) {
                    case 0:
                        str = "reel_viewer";
                        break;
                    case 1:
                        str = "story_tray";
                        break;
                    case 2:
                        str = "feed_timeline";
                        break;
                    default:
                        str = "feed_peek";
                        break;
                }
                A0I.A0T("event_source", str);
                if (l != null) {
                    A0I.A0S("sponsor_ig_id", Long.valueOf(l.longValue()));
                }
                A0I.Bb4();
            }
        }
    }

    public static /* synthetic */ void A03(C11630kW r6, UserSession userSession, Integer num, Integer num2, Integer num3, String str, String str2, Throwable th, Map map, int i) {
        String str3;
        String str4;
        String str5;
        String str6;
        if ((i & 8) != 0) {
            map = null;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            th = null;
        }
        if ((i & 64) != 0) {
            num2 = null;
        }
        if ((i & 128) != 0) {
            str2 = null;
        }
        if ((i & 256) != 0) {
            num3 = null;
        }
        AnonymousClass0wJ.A1N(userSession, r6);
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r6, userSession), "ig_branded_content_event"), 823);
        if (AnonymousClass0wJ.A1U(A0I)) {
            User A0Y = AnonymousClass0wJ.A0Y(userSession);
            LinkedHashMap A0y = C18220wO.A0y();
            if (map != null) {
                A0y.putAll(map);
            }
            if (num == AnonymousClass006.A0Y) {
                A0y.putAll(AnonymousClass4WJ.A0G(C18180wK.A0p("can_use_branded_content_discovery_as_brand", String.valueOf(C18210wN.A1T(A0Y.A05.AW5()))), C18180wK.A0p("can_use_branded_content_discovery_as_creator", String.valueOf(A0Y.A2q()))));
            }
            if (num2 != null) {
                switch (num2.intValue()) {
                    case 1:
                        str6 = "feed_advanced_settings";
                        break;
                    case 2:
                        str6 = "feed_edit";
                        break;
                    case 3:
                        str6 = "story";
                        break;
                    case 4:
                        str6 = "story_edit";
                        break;
                    case 5:
                        str6 = "video_main";
                        break;
                    case 6:
                        str6 = "video_advanced_settings";
                        break;
                    case 7:
                        str6 = "video_edit";
                        break;
                    case 8:
                        str6 = "reel";
                        break;
                    case 9:
                        str6 = "reel_edit";
                        break;
                    case 10:
                        str6 = "panavision";
                        break;
                    case 11:
                        str6 = "panavision_edit";
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        str6 = "live";
                        break;
                    case 13:
                        str6 = "suspected_bc_notif";
                        break;
                    default:
                        str6 = "feed_main";
                        break;
                }
                A0y.put("entrypoint", str6);
            }
            if (str2 != null) {
                A0y.put("entrypoint", str2);
            }
            if (num3 != null) {
                if (1 - num3.intValue() != 0) {
                    str5 = "brands_only";
                } else {
                    str5 = "project_and_brands";
                }
                A0y.put("flow", str5);
            }
            switch (num.intValue()) {
                case 1:
                    str3 = "bc_ineligible_launch_unified_monetization_screen";
                    break;
                case 2:
                    str3 = "bc_partnerships_creator_entrypoint_impression";
                    break;
                case 3:
                    str3 = "bc_partnerships_brand_entrypoint_impression";
                    break;
                case 4:
                    str3 = "branded_content_creator_contact_about_partnership_tap";
                    break;
                case 5:
                    str3 = "settings_screen_impression";
                    break;
                case 6:
                    str3 = "approve_creators_screen_impression";
                    break;
                case 7:
                    str3 = "approve_creators_screen_button_action";
                    break;
                case 8:
                    str3 = "approve_creators_screen_request_impression";
                    break;
                case 9:
                    str3 = "request_brand_approval_screen_impression";
                    break;
                case 10:
                    str3 = "approve_media_request_screen_impression";
                    break;
                case 11:
                    str3 = "approve_media_request_screen_button_action";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    str3 = "ig_branded_content_allowlisted_accounts_entry";
                    break;
                case 13:
                    str3 = "branded_content_creator_contact_drawer_shown";
                    break;
                case 14:
                    str3 = "brand_onboarding_bc_settings_impression";
                    break;
                case 15:
                    str3 = "brand_onboarding_bc_settings_click";
                    break;
                case 16:
                    str3 = "app_campaign_cta_click";
                    break;
                case LangUtils.HASH_SEED /*17*/:
                    str3 = "desktop_tool_bc_settings_impression";
                    break;
                case 18:
                    str3 = "desktop_tool_bc_settings_click";
                    break;
                case 19:
                    str3 = "add_pp_label_toggle_switched";
                    break;
                case 20:
                    str3 = "add_brand_partners_brand_action";
                    break;
                case 21:
                    str3 = "add_brand_partners_next_button_tapped";
                    break;
                case 22:
                    str3 = "disclosure_entrypoint_rendered";
                    break;
                case 23:
                    str3 = "disclosure_suggestions_rendered";
                    break;
                case 24:
                    str3 = "disclosure_entrypoint_tapped";
                    break;
                case 25:
                    str3 = "disclosure_suggestion_tapped";
                    break;
                case Rfc3492Idn.tmax /*26*/:
                    str3 = "disclosure_menu_rendered";
                    break;
                case 27:
                    str3 = "disclosure_menu_select_project_click";
                    break;
                case 28:
                    str3 = "disclosure_menu_add_brands_manually_click";
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                    str3 = "disclosure_menu_back_click";
                    break;
                case 30:
                    str3 = "disclosure_menu_project_deselected";
                    break;
                case 31:
                    str3 = "disclosure_menu_audience_restrictions_click";
                    break;
                case 32:
                    str3 = "disclosure_menu_brand_deselected";
                    break;
                case 33:
                    str3 = "disclosure_menu_ads_permission_toggled";
                    break;
                case 34:
                    str3 = "disclosure_review_done_button_tapped";
                    break;
                case 35:
                    str3 = "disclosure_review_brand_partners_tapped";
                    break;
                case Rfc3492Idn.base /*36*/:
                    str3 = "disclosure_review_brand_removed";
                    break;
                case LangUtils.HASH_OFFSET /*37*/:
                    str3 = "disclosure_review_add_audience_restrictions_tapped";
                    break;
                case Rfc3492Idn.skew /*38*/:
                    str3 = "request_approval_dialog_action";
                    break;
                case 39:
                    str3 = "project_selection_project_selected";
                    break;
                case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                    str3 = "project_selection_done_click";
                    break;
                case Seq.NULL_REFNUM /*41*/:
                    str3 = "project_selection_back_click";
                    break;
                case Seq.RefTracker.REF_OFFSET /*42*/:
                    str3 = "error_loading_user";
                    break;
                case 43:
                    str3 = "error_get_list_of_projects_api";
                    break;
                case 44:
                    str3 = "error_get_list_of_projects_missing_fields";
                    break;
                case 45:
                    str3 = "stories_more_options_menu_item_count";
                    break;
                case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                    str3 = "error_get_list_of_campaign_api";
                    break;
                case 47:
                    str3 = "error_get_list_of_campaign_missing_fields";
                    break;
                case 48:
                    str3 = "suspected_bc_alert_impression";
                    break;
                case 49:
                    str3 = "suspected_bc_share_anyway_tapped";
                    break;
                case AnimationSpecKt.IDLE_DURATION /*50*/:
                    str3 = "suspected_bc_add_tags_tapped";
                    break;
                case 51:
                    str3 = "suspected_bc_creator_review_impression";
                    break;
                case 52:
                    str3 = "suspected_bc_creator_add_ppl_tapped";
                    break;
                case 53:
                    str3 = "suspected_bc_creator_not_bc_tapped";
                    break;
                case 54:
                    str3 = "suspected_bc_creator_review_confirmation_impression";
                    break;
                case 55:
                    str3 = "paid_partnership_label_impression";
                    break;
                default:
                    str3 = "bc_ineligible_screen_impression";
                    break;
            }
            C18230wP.A1G(A0I, str3);
            A0I.A0S("user_ig_id", AnonymousClass0wJ.A0d(userSession.getUserId()));
            AnonymousClass266 A0g = A0Y.A0g();
            if (A0g != null) {
                str4 = A0g.A01;
            } else {
                str4 = null;
            }
            C18250wR.A10(A0I, "account_type", str4, (String) null);
            A0I.A1g(A0y);
            if (str != null) {
                A0I.A0S("creator_ig_id", AnonymousClass0wJ.A0d(str));
            }
            if (th != null) {
                A0I.A0T("exception_message", th.getMessage());
                A0I.A0T("exception_trace", AnonymousClass721.A00(th));
            }
            A0I.Bb4();
        }
    }
}
