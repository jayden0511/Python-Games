!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <link rel="icon" href="/favicon.png">

        
        <title>Pig Latin Translator ― LingoJam</title>
        <!--<meta name="description" content="Convert English into Pig Latin with this online translator.">-->
        <meta name="viewport" content="width=device-width">

        <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
		
               <link rel="canonical" href="https://lingojam.com/PigLatinTranslator">

       <link href='https://fonts.googleapis.com/css?family=Noto+Sans|Fredericka+the+Great|Coming+Soon' rel='stylesheet' type='text/css'>

        <link rel="stylesheet" href="../css/normalize.css">
        <link rel="stylesheet" href="../css/main.css?v=8dddssfdd6d4d8657">
		    <link rel="stylesheet" href="../css/translator.css?v=8dddsddtdsdffd8d6d4d8657">
		    <style>
	        #suggestion-box, #submit-suggestion {
            font-size:20px;
            line-height:30px;
            background:white;
            border: 1px solid #808080;
            font-family: 'Noto Sans', sans-serif;
            border-radius: 2px;
            outline:none;
          }
          #suggestion-box {
            box-sizing: border-box;
            padding-left: 8px;
          }
          #submit-suggestion {
          }
          #submit-suggestion:hover {
            background-color:#ECECEC;
          }
        </style>
		<style>
		  html {
            color-scheme: light dark;
          }
          
          .lingojam-logo-text {
            color: white;
          }
          
          .disqus-container {
            color-scheme: normal;
          }
          
          .disqus-container button {
            color-scheme: light dark;
          }

          @media (prefers-color-scheme: dark) {
            body {
              background:black;
              color:#d7d7d7;
            }
            .translate-container textarea {
              background:#1d1d1d !important;
            }
            .white-section-area-thing {
              background: #1d1d1d;
            }
            .readmore-gradient {
              filter:invert(1);
            }
            html, button, input, select, textarea {
              color: #d7d7d7;
            }
            #suggestion-box, #submit-suggestion {
              background: initial;
              border: 1px solid #808080;
              color: inherit;
            }
            .main-title h1 {
              filter: brightness(0.8);
            }
            .translate-container .transdiv {
              background:#1d1d1d !important;
            }
            .disqus-container {
              background:#1d1d1d !important;
            }
            .create-a-translator-btn {
              filter: brightness(0.8);
            }
            .lingojam-logo-text {
              color: #d0d0d0;
            }
          }
          
          @media screen and (max-width: 500px) {
            .white-section-area-thing {
              padding: 10px;
            }
            .translate-container textarea {
              padding: 10px;
            }
            .disqus-container {
              padding: 10px;
            }
          }
		    </style>
       <!--<script src="../js/vendor/modernizr-2.6.2.min.js"></script>-->
        <script>
          eval(function(p,a,c,k,e,r){e=function(c){return c.toString(a)};if(!''.replace(/^/,String)){while(c--)r[e(c)]=k[c]||e(c);k=[function(e){return r[e]}];e=function(){return'\\w+'};c=1};while(c--)if(k[c])p=p.replace(new RegExp('\\b'+e(c)+'\\b','g'),k[c]);return p}('c(9["\\4\\0\\5\\1\\6\\7\\0\\2"]["\\8\\0\\b\\6\\2\\1\\3\\d"]==="\\4\\7\\2\\e\\0\\f\\1\\3\\g\\5\\0\\3"){h a=i}',19,19,'u006f|u0061|u006e|u006d|u006c|u0063|u0074|u0069|u0068|window||u0073|if|u0065|u0067|u006a|u002e|var|true'.split('|'),0,{}))
        </script>

    <script>
    // CACHE BUSTING:
    (async function() {
      // we have separate cache busting for editors since we need *immediate* cache busting.
      if(localStorage["PigLatinTranslator/lastSaveTime"] && Date.now() < (1000*60*60*24)+Number(localStorage["PigLatinTranslator/lastSaveTime"])) { // if they are the editor and it was saved less than a day ago
        console.log("user is editor/owner");
        if(window.location.search === "") { // and cache hasn't been busted
          // bust cache
          console.log("busting cache");
          window.location.href = window.location.href+"?cacheBust="+localStorage["PigLatinTranslator/lastSaveTime"];
        } else {
          // otherwise tidy up url (remove query string):
          console.log("tidying up query string");
          history.replaceState({}, "", window.location.pathname);
        }
      }
      // This doesn't make sense. It'd cause annoying cache-busting for up to a month if maxAge was a month.
      /* else {
        let cachedLastSaveTime = 1459565573;
        // Note: `php/getTranslatorLastSaveTime.php` is CACHED by cloudflare with a lifetime of 5 mins (hence, cache bust is not immediate - in exchange for way fewer hits to this API)
        let actualLastSaveTime = Number(await fetch("https://lingojam.com/php/getTranslatorLastSaveTime.php?urlName=PigLatinTranslator").then(r => r.text()));
        if(isNaN(actualLastSaveTime)) {
          console.error(`lastSaveTime is NaN?`);
          return;
        }
        if(actualLastSaveTime !== cachedLastSaveTime) {
          console.log("user is not editor/owner, but this is an outdated copy");
          // bust cache
          console.log("busting cache");
          window.location.href = window.location.href+"?cacheBust="+actualLastSaveTime; // <-- NOT a random cacheBust string means way fewer server hits
        } else {
          if(window.location.search.includes("?cacheBust=")) {
            // tidy up url (remove query string):
            console.log("tidying up query string");
            history.replaceState({}, "", window.location.pathname);
          }
          console.log("this copy of translator is fresh");
        }
      }*/
    })();
    </script>


    <!-- main ads -->
    <script>
      //window.adProviderName = "snigel";
      //if(Math.random() < 0.70) {
      //  window.adProviderName = Math.random() < (10/70) ? "freestar" : "sovrn";
      //}
      window.adProviderName = "freestar";

      if(location.hash.includes("adProviderName=snigel")) window.adProviderName = "snigel";
      else if(location.hash.includes("adProviderName=freestar")) window.adProviderName = "freestar";
      else if(location.hash.includes("adProviderName=none")) window.adProviderName = "none";
      
      console.log("adProviderName:", window.adProviderName);
    </script>

    <script type="text/javascript" async=true>
      // InMobi Choice. Consent Manager Tag v3.0 (for TCF 2.2)
      !function(){var host=window.location.hostname,element=document.createElement("script"),firstScript=document.getElementsByTagName("script")[0],url="https://cmp.inmobi.com".concat("/choice/","AY2V1mmRQwast","/",host,"/choice.js?tag_version=V3"),uspTries=0;element.async=!0,element.type="text/javascript",element.src=url,firstScript.parentNode.insertBefore(element,firstScript),function makeStub(){for(var cmpFrame,queue=[],win=window;win;){try{if(win.frames.__tcfapiLocator){cmpFrame=win;break}}catch(ignore){}if(win===window.top)break;win=win.parent}cmpFrame||(!function addFrame(){var doc=win.document,otherCMP=!!win.frames.__tcfapiLocator;if(!otherCMP)if(doc.body){var iframe=doc.createElement("iframe");iframe.style.cssText="display:none",iframe.name="__tcfapiLocator",doc.body.appendChild(iframe)}else setTimeout(addFrame,5);return!otherCMP}(),win.__tcfapi=function tcfAPIHandler(){var gdprApplies,args=arguments;if(!args.length)return queue;if("setGdprApplies"===args[0])args.length>3&&2===args[2]&&"boolean"==typeof args[3]&&(gdprApplies=args[3],"function"==typeof args[2]&&args[2]("set",!0));else if("ping"===args[0]){var retr={gdprApplies:gdprApplies,cmpLoaded:!1,cmpStatus:"stub"};"function"==typeof args[2]&&args[2](retr)}else"init"===args[0]&&"object"==typeof args[3]&&(args[3]=Object.assign(args[3],{tag_version:"V3"})),queue.push(args)},win.addEventListener("message",(function postMessageEventHandler(event){var msgIsString="string"==typeof event.data,json={};try{json=msgIsString?JSON.parse(event.data):event.data}catch(ignore){}var payload=json.__tcfapiCall;payload&&window.__tcfapi(payload.command,payload.version,(function(retValue,success){var returnMsg={__tcfapiReturn:{returnValue:retValue,success:success,callId:payload.callId}};msgIsString&&(returnMsg=JSON.stringify(returnMsg)),event&&event.source&&event.source.postMessage&&event.source.postMessage(returnMsg,"*")}),payload.parameter)}),!1))}(),function makeGppStub(){const SUPPORTED_APIS=["2:tcfeuv2","6:uspv1","7:usnatv1","8:usca","9:usvav1","10:uscov1","11:usutv1","12:usctv1"];window.__gpp_addFrame=function(n){if(!window.frames[n])if(document.body){var i=document.createElement("iframe");i.style.cssText="display:none",i.name=n,document.body.appendChild(i)}else window.setTimeout(window.__gpp_addFrame,10,n)},window.__gpp_stub=function(){var b=arguments;if(__gpp.queue=__gpp.queue||[],__gpp.events=__gpp.events||[],!b.length||1==b.length&&"queue"==b[0])return __gpp.queue;if(1==b.length&&"events"==b[0])return __gpp.events;var cmd=b[0],clb=b.length>1?b[1]:null,par=b.length>2?b[2]:null;if("ping"===cmd)clb({gppVersion:"1.1",cmpStatus:"stub",cmpDisplayStatus:"hidden",signalStatus:"not ready",supportedAPIs:SUPPORTED_APIS,cmpId:10,sectionList:[],applicableSections:[-1],gppString:"",parsedSections:{}},!0);else if("addEventListener"===cmd){"lastId"in __gpp||(__gpp.lastId=0),__gpp.lastId++;var lnr=__gpp.lastId;__gpp.events.push({id:lnr,callback:clb,parameter:par}),clb({eventName:"listenerRegistered",listenerId:lnr,data:!0,pingData:{gppVersion:"1.1",cmpStatus:"stub",cmpDisplayStatus:"hidden",signalStatus:"not ready",supportedAPIs:SUPPORTED_APIS,cmpId:10,sectionList:[],applicableSections:[-1],gppString:"",parsedSections:{}}},!0)}else if("removeEventListener"===cmd){for(var success=!1,i=0;i<__gpp.events.length;i++)if(__gpp.events[i].id==par){__gpp.events.splice(i,1),success=!0;break}clb({eventName:"listenerRemoved",listenerId:par,data:success,pingData:{gppVersion:"1.1",cmpStatus:"stub",cmpDisplayStatus:"hidden",signalStatus:"not ready",supportedAPIs:SUPPORTED_APIS,cmpId:10,sectionList:[],applicableSections:[-1],gppString:"",parsedSections:{}}},!0)}else"hasSection"===cmd?clb(!1,!0):"getSection"===cmd||"getField"===cmd?clb(null,!0):__gpp.queue.push([].slice.apply(b))},window.__gpp_msghandler=function(event){var msgIsString="string"==typeof event.data;try{var json=msgIsString?JSON.parse(event.data):event.data}catch(e){json=null}if("object"==typeof json&&null!==json&&"__gppCall"in json){var i=json.__gppCall;window.__gpp(i.command,(function(retValue,success){var returnMsg={__gppReturn:{returnValue:retValue,success:success,callId:i.callId}};event.source.postMessage(msgIsString?JSON.stringify(returnMsg):returnMsg,"*")}),"parameter"in i?i.parameter:null,"version"in i?i.version:"1.1")}},"__gpp"in window&&"function"==typeof window.__gpp||(window.__gpp=window.__gpp_stub,window.addEventListener("message",window.__gpp_msghandler,!1),window.__gpp_addFrame("__gppLocator"))}();var uspStubFunction=function(){var arg=arguments;typeof window.__uspapi!==uspStubFunction&&setTimeout((function(){void 0!==window.__uspapi&&window.__uspapi.apply(window.__uspapi,arg)}),500)};if(void 0===window.__uspapi){window.__uspapi=uspStubFunction;var uspInterval=setInterval((function(){uspTries++,window.__uspapi===uspStubFunction&&uspTries<3?console.warn("USP is not accessible"):clearInterval(uspInterval)}),6e3)}}();
    </script>

    <script>
      if(window.adProviderName === "snigel") {
        document.write(`<script data-cfasync="false" async src="https://cdn.snigelweb.com/adengine/lingojam.com/loader.js" type="text/javascript"><\/script>`);
      } else if(window.adProviderName === "freestar") {
        var freestar = freestar || {};
        freestar.queue = freestar.queue || [];
        freestar.config = freestar.config || {};
        freestar.config.enabled_slots = [];
        freestar.initCallback = function () { (freestar.config.enabled_slots.length === 0) ? freestar.initCallbackCalled = false : freestar.newAdSlots(freestar.config.enabled_slots) }
        document.write(`<script src="https://a.pub.network/lingojam-com/pubfig.min.js" async><\/script>`);
      }
    </script>

    <!-- https://blockthrough.com/ -->
    <script src="https://btloader.com/tag?o=5658536637890560&upapi=true" async></script>


  </head>
  <body>

    <script>document.documentElement.style.setProperty('--original-viewport-height', window.innerHeight+"px")</script>
    <style>
      /* this causes jittery scroll in chrome */
      /*body {
          background: url(/img/upload/piglatintranslator_bgImage.jpg);
          background-position:center;
          background-attachment:fixed;
          background-size:cover;
      }*/
      body {
        min-height: 100vh;
        position: relative;
      }
      body::before {
        content: "";
        position: fixed;
        background-color:#dddddd;
                  background-image: url(/img/upload/piglatintranslator_bgImage.jpg);
          background-size: cover;
          background-position: center;
                height: 100%;
        width: 100%;
        min-height: var(--original-viewport-height);
        left: 0;
        top: 0;
        will-change: transform;
        z-index: -1;
      }
    </style>

	<!--<div id="fb-root"></div>
	<script>(function(d, s, id) {
	  var js, fjs = d.getElementsByTagName(s)[0];
	  if (d.getElementById(id)) return;
	  js = d.createElement(s); js.id = id;
	  js.src = "//connect.facebook.net/en_US/all.js#xfbml=1&appId=221272414667675";
	  fjs.parentNode.insertBefore(js, fjs);
	}(document, 'script', 'facebook-jssdk'));</script>-->
        <!--[if lt IE 7]>
            <p class="chromeframe">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> or <a href="http://www.google.com/chromeframe/?redirect=true">activate Google Chrome Frame</a> to improve your experience.</p>
        <![endif]-->

        <!-- Add your site or application content here -->
		<p class="lingojam-logo" style="font-size:24px;background-color: #222222; margin-top: 0; position:fixed; top:0; left:0; width:100%; z-index: 2147483647;">
		          <a href="https://lingojam.com"><button class="btn blue create-a-translator-btn" style="position:fixed; top:4px; right:4px; height:25px;z-index: 5000;width: 190px;">CREATE A TRANSLATOR</button></a>
		  <a href="https://lingojam.com" class="lingojam-logo-text" style="text-decoration:none;">LINGO<span style="color:#b93d3d;">JAM</span></a>
		</p>
		<div class="main-title">
            <h1  >Pig Latin Translator</h1>

								<style>
						.main-title h1 {
							font-family: 'Fredericka the Great', Arial;
							text-transform:none;
						}
					</style>
			
            <h2 style="font-size: 18px;" class="subtitle">Translate English into Pig Latin.</h2>
		</div>
        <div class="translate-container">
			<div class="halving-div-left">
                <div class="transdiv english box-shadow-1" style="position: relative;">
                    <textarea style="background-color:white; font-family: Arial;  " id="english-text" placeholder="English goes here..."></textarea>

                                        <button id="random-sentence" class="corner-button">Generate Random Sentence</button>
                    <style>
                        .corner-button {
                            bottom: 10px;
                            right: 10px;
                            position: absolute;
                            background: transparent;
                            border: 1px solid #aaa;
                            border-radius: 3px;
                            color: #aaa;
                            height: 27px;
                            outline:none;
                        }
                        .corner-button:hover {
                            color: #545454;
                            border: 1px solid #545454;
                        }
                    </style>
                    				</div>
			</div>
			<div class="between-halving-divs"></div>
            <!-- <div style="width:100%; margin-top: 20px;height: 50px;overflow: hidden;"></div> -->
			<div class="halving-div-right">
                <div class="transdiv ghetto box-shadow-1" style="position: relative;">
                    <textarea style="background-color: white; font-family:Coming Soon, Arial;  "  id="ghetto-text" placeholder="And Pig Latin will appear here...."></textarea>
				</div>
			</div>
            <div style="clear:both"></div>
		</div>

    <style>
    .adsense-area {
      width: 95%;
      /*margin-top:20px;*/
      margin-left:auto;
      margin-right:auto;
      min-height: 250px;
      overflow: hidden;

      /*background: #fff;
      padding-top: 10px;
      padding-bottom: 10px;
      border-radius: 2px;
      box-shadow: 0 1px 1px rgba(0, 0, 0, 0.3);*/
    }
    @media (min-width: 0px) and (max-width: 768px) {
      .adsense-area {box-sizing: border-box; margin-left:auto; margin-right:auto; width: 95%; }
    }
    @media(min-width: 0px) and (max-width:330px) {
      .adsense-area { width: 100%; }
    }
    #adsense-area-label:before {
      content: "advertisement";
    }
    .between-halving-divs {
      
    }
    </style>
    <p id="adsense-area-label" style="text-align:center; margin:0; color:grey; font-size:90%; font-variant:small-caps; margin-top:20px;"></p>
		<div class="adsense-area" style="text-align:center;">
      <div style="font-size:85%;text-align: center; font-family: 'Noto Sans', sans-serif; opacity: 0.7; font-variant: small-caps; display:none;">advertisement</div>
        <div style="width:100%; overflow:hidden; max-height: 300vh;">
            <script>
              if(window.adProviderName === "sovrn") document.write(`<div class="proper-ad-unit"> <div id="proper-ad-lingojam_content_1"><script>propertag.cmd.push(function() { proper_display('lingojam_content_1'); });<\/script></div></div>`);
              else if(window.adProviderName === "sortable") document.write(`<script src="//tags-cdn.deployads.com/a/lingojam.com.js" async ><\/script><div class="ad-tag" data-ad-name="Leaderboard_1" data-ad-size="auto" ></div><script>(deployads = window.deployads || []).push({});<\/script>`);
              else if(window.adProviderName === "snigel") document.write(`<div id="adngin-top_banner-0" style="margin:auto;"></div><div id="adngin-bottom_adhesive-0"></div><div id="adngin-outstream-0"></div>`);
              else if(window.adProviderName === "freestar") document.write(`<!-- Tag ID: lingojam.com_leaderboard_medrec_2 --> <style>div[data-freestar-ad="__300x250"] { display: inline-block !important; }</style> <div align="center" data-freestar-ad="__300x250" id="lingojam.com_leaderboard_medrec_2"> <script data-cfasync="false" type="text/javascript"> freestar.config.enabled_slots.push({ placementName: "lingojam.com_leaderboard_medrec_2", slotId: "lingojam.com_leaderboard_medrec_2" }); <\/script> </div> <!-- Tag ID: lingojam.com_leaderboard_medrec_1 --> <div align="center" data-freestar-ad="__300x250" id="lingojam.com_leaderboard_medrec_1"> <script data-cfasync="false" type="text/javascript"> freestar.config.enabled_slots.push({ placementName: "lingojam.com_leaderboard_medrec_1", slotId: "lingojam.com_leaderboard_medrec_1" }); <\/script> </div> <!-- Tag ID: lingojam.com_leaderboard_medrec_3 --> <div align="center" data-freestar-ad="__300x250" id="lingojam.com_leaderboard_medrec_3"> <script data-cfasync="false" type="text/javascript"> freestar.config.enabled_slots.push({ placementName: "lingojam.com_leaderboard_medrec_3", slotId: "lingojam.com_leaderboard_medrec_3" }); <\/script> </div>`);
              // else if(window.adProviderName === "freestar") document.write(`<!-- Tag ID: lingojam.com_leaderboard_1 --> <div align="center" data-freestar-ad="__300x250 __336x280" id="lingojam.com_leaderboard_1"><script data-cfasync="false" type="text/javascript">freestar.config.enabled_slots.push({ placementName: "lingojam.com_leaderboard_1", slotId: "lingojam.com_leaderboard_1" });<\/script></div>`);
            </script>
        </div>
    </div>

        <div id="suggestion-area" class="white-section-area-thing">
            <input id="suggestion-box" style="width:80%;" placeholder="Suggestions to improve this translator?" maxlength="5000"></input>
        <button id="submit-suggestion" style="width:18%; float:right;">Send</button>
        </div>

		<div class="intro white-section-area-thing" style="position: relative; overflow: hidden;">
			<h2>Pig Latin</h2>
<div class='intro-p'>In case you're not quite sure what Pig Latin is, you could read the wikipedia article on <a target='_blank' href="https://en.wikipedia.org/wiki/Pig_Latin">Pig Latin</a>, otherwise I'll give a brief explanation here.</div>
<div class='intro-p'>Pig Latin is not an actual language. It's what linguists call a &quot;<a target='_blank' href="https://en.wikipedia.org/wiki/Language_game">language game</a>&quot;. A language game (also sometimes called a &quot;ludling&quot; or &quot;argot&quot;) is a set of rules applied to an existing language which make that language incomprehensible to the untrained ear.</div>
<div class='intro-p'>The rules used by Pig Latin are as follows:</div>
<ol>
<li>If a word begins with a vowel, just as &quot;yay&quot; to the end. For example, &quot;out&quot; is translated into &quot;outyay&quot;.</li>
<li>If it begins with a consonant, then we take all consonants before the first vowel and we put them on the end of the word. For example, &quot;which&quot; is translated into &quot;ichwhay&quot;.</li>
</ol>
<h2>Why is it called Pig Latin?</h2>
<div class='intro-p'>Of course, Pig Latin is not a form of real Latin. It's only called that because it sounds like a foreign language when spoken. The word &quot;pig&quot; has less obvious origins. It may have originated from the term &quot;dog Latin&quot; which is sometimes used to describe poorly written or spoken Latin.</div>
<div class='intro-p'>The origins of Pig Latin go can be traced back to at least 1886 where a preserved article make a reference to &quot;hog latin&quot; which is spoken by young children. It is believed that the modern version of Pig Latin was first described ina 1947 newspaper.</div>
<h2>Ixnay, Amscray and Upidstay</h2>
<div class='intro-p'>These three words are probably the most well known Pig Latin words. In some areas and cultures they have even managed to enter the common vocabulary. Below are the definitions of these words:</div>
<ul>
<li><strong>Ixnay:</strong> A Pig-Latinised version of the word &quot;nix&quot;, meaning nothing/zip/nada. Can mean &quot;no&quot; as an interjection, or can communicate that a person doesn't want another to do or say something. For example, if you didn't want someone to mention the word &quot;walk&quot; when around a pet dog, you might say &quot;Ixnay on the W-A-L-K while the dogs can hear you.&quot;</li>
<li><strong>Amscray:</strong> Pig-Latinised version of &quot;scram&quot;, as in &quot;get out of here!&quot;</li>
<li><strong>Upidstay:</strong> Pig-Latinised version of  &quot;stupid&quot;.</li>
</ul>
           <!-- <div class="share">
                <div class="fb-like-wrapper">
                    <div class="fb-like" data-send="false" data-width="225" data-show-faces="false"></div>
                </div>
                <div class="twitter-wrapper">
                    <a href="https://twitter.com/share" class="twitter-share-button" data-text="#success">Tweet</a>
                    <script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);}}(document, 'script', 'twitter-wjs');</script>
                </div>
            </div> -->

            <div style="display:none;" class="readmore-box readmore-gradient"><span id="intro-read-more-button">↓ Read more... ↓</span></div>
		</div>

		<div class="adsense-area" style="padding-top:2px; display:none;">
<div style="font-size:85%;text-align: center; font-family: 'Noto Sans', sans-serif;opacity: 0.7; font-variant: small-caps;">advertisement</div>
                    <div style="width:100%; overflow:hidden;">
                      
                        <!-- Leaderboard_2 (responsive) -->
                        <!-- <div class="no-ad-2" data-ad-name="Leaderboard_2" data-ad-size="auto" ></div> -->
                        <!-- <script src="//tags-cdn.deployads.com/a/lingojam.com.js" async ></script> -->
                        <!--<script>(deployads = window.deployads || []).push({});</script>-->
                        
                   </div>
		</div>
    <style>
    .readmore-box {
      position: absolute;
      bottom: 0;
      width: 100%;
      text-align: center;
      margin-left: -20px;
      height: 70px;
      line-height: 98px;
    }
    .readmore-box span {
      cursor: pointer;
      color: #444;
      border: 1px solid #444;
      padding: 4px;
      border-radius: 2px;
    }
    .readmore-box span:hover {
      color: #000;
      border: 1px solid #000;
    }

  .readmore-gradient {
    background-color: rgba(0,0,0,0);
    /* IE9, iOS 3.2+ */
    background-image: url(data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHdpZHRoPSIxMDAlIiBoZWlnaHQ9IjEwMCUiIHZpZXdCb3g9IjAgMCAxIDEiIHByZXNlcnZlQXNwZWN0UmF0aW89Im5vbmUiPjxsaW5lYXJHcmFkaWVudCBpZD0idnNnZyIgZ3JhZGllbnRVbml0cz0idXNlclNwYWNlT25Vc2UiIHgxPSIwJSIgeTE9IjEwMCUiIHgyPSIwJSIgeTI9IjAlIj48c3RvcCBzdG9wLWNvbG9yPSIjZmZmZmZmIiBzdG9wLW9wYWNpdHk9IjEiIG9mZnNldD0iMCIvPjxzdG9wIHN0b3AtY29sb3I9IiNmZmZmZmYiIHN0b3Atb3BhY2l0eT0iMC45NiIgb2Zmc2V0PSIwLjQzNiIvPjxzdG9wIHN0b3AtY29sb3I9IiMwMDAwMDAiIHN0b3Atb3BhY2l0eT0iMCIgb2Zmc2V0PSIxIi8+PC9saW5lYXJHcmFkaWVudD48cmVjdCB4PSIwIiB5PSIwIiB3aWR0aD0iMSIgaGVpZ2h0PSIxIiBmaWxsPSJ1cmwoI3ZzZ2cpIiAvPjwvc3ZnPg==);
    background-image: -webkit-gradient(linear, 0% 100%, 0% 0%,color-stop(0, rgb(255, 255, 255)),color-stop(0.436, rgba(255, 255, 255, 0.96)),color-stop(1, rgba(0, 0, 0, 0)));
    /* Android 2.3 */
    background-image: -webkit-repeating-linear-gradient(bottom,rgb(255, 255, 255) 0%,rgba(255, 255, 255, 0.96) 43.6%,rgba(0, 0, 0, 0) 100%);
    /* IE10+ */
    background-image: repeating-linear-gradient(to top,rgb(255, 255, 255) 0%,rgba(255, 255, 255, 0.96) 43.6%,rgba(0, 0, 0, 0) 100%);
    background-image: -ms-repeating-linear-gradient(bottom,rgb(255, 255, 255) 0%,rgba(255, 255, 255, 0.96) 43.6%,rgba(0, 0, 0, 0) 100%);
}

/* IE8- CSS hack */
@media \0screen\,screen\9 {
    .readmore-gradient {
        filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#00000000",endColorstr="#ffffffff",GradientType=0);
    }
}


    </style>


		<!--<div class="footer"><p></p></div>-->
		<br/>


<!--		<div class="disqus-container">
<script>talkyardServerUrl='https://comments-for-lingojam-com.talkyard.net';</script>
<script async defer src="https://cdn.talkyard.net/-/talkyard-comments.min.js"></script>
<div class="talkyard-comments" data-discussion-id="PigLatinTranslator">
<noscript>Please enable Javascript to view comments.</noscript>
</div>
                </div>-->

                <div class="disqus-container" style="text-align:center;">
                <button id="load_disqus_comments_button_el_78374562" onclick="loadDisqusComments(); this.style.display = 'none';">Load Disqus Comments</button>
                  <div id="disqus_thread"></div>
	 	  <script type="text/javascript">
		    function loadDisqusComments() {
                        /* * * CONFIGURATION VARIABLES: EDIT BEFORE PASTING INTO YOUR WEBPAGE * * */
	            var disqus_shortname = 'lingojam'; // required: replace example with your forum shortname
	            var disqus_config = function () {
			            this.page.identifier = window.location.pathname.split("/")[1];
	            };

	            /* * * DON'T EDIT BELOW THIS LINE * * */
	            (function() {
		            var dsq = document.createElement('script'); dsq.type = 'text/javascript'; dsq.async = true;
		            dsq.src = '//' + disqus_shortname + '.disqus.com/embed.js';
		            (document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(dsq);
	            })();
            }

            // var userHasScrolledSinceLastDisqusCheck = false;
            // window.addEventListener("scroll", function() {
            //   userHasScrolledSinceLastDisqusCheck = true;
            // });
            // var disqusScrollLoaderInterval = setInterval(function() {
            //   if(!userHasScrolledSinceLastDisqusCheck) return;
            //   userHasScrolledSinceLastDisqusCheck = false;
            //   var ctn = document.querySelector(".disqus-container");
            //   var distance = 300; // distance from bottom of window to disqus embed to trigger load
            //   if(window.scrollY+window.innerHeight+distance > ctn.offsetTop) {
            //     clearInterval(disqusScrollLoaderInterval);
            //     if(ctn.querySelector("button").offsetParent) ctn.querySelector("button").click(); // <-- click the button to load the comments
            //     if(document.querySelector(".no-ad-2")) { // (because not all pages have ads)
            //       document.querySelector(".no-ad-2").closest(".adsense-area").style.display = "none";
            //       //document.querySelector(".no-ad-2").innerHTML = '<iframe width="560" height="315" src="https://www.youtube-nocookie.com/embed/Z3u7hXpOm58" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen="" style="margin: 0 auto;display: block;"></iframe>';
            //       // Sortable:
            //       //var adEl = document.querySelector(".no-ad-2");
            //       //adEl.classList.remove('no-ad-2');
            //       //adEl.classList.add('ad-tag');
            //       //(deployads = window.deployads || []).push({});
            //     }
            //   }
            // }, 1000);
		  </script>
		  <noscript>Please enable JavaScript to view comments</noscript>
		</div>



        <script>
          window.addEventListener("DOMContentLoaded", function() {
            console.log("The 'load' event fired.");
            setTimeout(function() {
              if(window.location.hash.includes("disableDisqus")) return;
              console.log("Loading disqus.");
              let btn = document.querySelector("#load_disqus_comments_button_el_78374562");
              if(btn && btn.offsetHeight > 0) btn.click(); // need `if` bc doesn't exist for private translators
            }, 10000);
          });
        </script>

        <div><p style="text-align:center; font-size: 13px; margin-bottom: 0; margin-top:25px;">LingoJam &#169; 2025 <a style="color:#444444" href="https://lingojam.com">Home</a> | <a style="color:#444444" href="https://lingojam.com/terms.html">Terms</a> &amp; <a style="color:#444444" href="https://lingojam.com/privacy.php">Privacy</a></p></div>
        
        <br><br><br><br><br>
        
        <script src="../js/vendor/jquery-1.9.1.min.js"></script>
        <!--<script>window.jQuery || document.write('<script src="js/vendor/jquery-1.9.1.min.js"><\/script>')</script>-->
        <script src="../js/plugins.js"></script>
        <script src="../js/translator.js"></script>
        <script src="../js/translate.js?v=29786864"></script>
		<script>

            //try {
                var reverseIsDisabled = false;
                //<![CDATA[
                function forward(text) {
  text = text.toLowerCase();
  text = text.replace(/ ?([.?!,]) ?/g, " $1 ");
  var array = text.split(" ");
  var word = "";
  for(var i = 0; i < array.length; i++) {
    word = array[i];
    if( isWord(word) ) array[i] = englishToPigLatin(array[i]);
  }
  text = array.join(" ");
  text.replace(/ ([!?.,]+)/g,"$1");
  return text;
}

function isWord(text) {
  return text.match(/[^a-zA-Z\-']/gi) === null;
}


function englishToPigLatin(word) {
  // if starts with a vowel, just add yay to end
  if(word.substring(0,1).match(/[aeiou]/gi) !== null) return word + "yay";

  // otherwise, grab first group of consonants and put on end and append ay
  return word.replace(/([b-df-hj-np-tv-z]+)(.+)/gi,"$2$1ay");
}

                
reverseIsDisabled = true;
function backward(text) { return $('#english-text').val(); }                //]]>
            //} catch(e) {
            //    alert("There's an error in the custom script of this translator. Error:"+e);
            //}


			try {
			

			var jsonData = {"phrases1":"","phrases2":"","words1":"","words2":"","intraword1":"","intraword2":"","prefixes1":"","prefixes2":"","suffixes1":"","suffixes2":"","regex1":"","regex2":"","rev_regex1":"","rev_regex2":"","ordering1":"","ordering2":""};
			phrases1 = jsonData.phrases1.split("\n");
			phrases2 = jsonData.phrases2.split("\n");
			words1 = jsonData.words1.split("\n");
			words2 = jsonData.words2.split("\n");
			intraword1 = jsonData.intraword1.split("\n");
			intraword2 = jsonData.intraword2.split("\n");
			prefixes1 = jsonData.prefixes1.split("\n");
			prefixes2 = jsonData.prefixes2.split("\n");
			suffixes1 = jsonData.suffixes1.split("\n");
			suffixes2 = jsonData.suffixes2.split("\n");
			regex1 = jsonData.regex1.split("\n");
			regex2 = jsonData.regex2.split("\n");
			rev_regex1 = jsonData.rev_regex1.split("\n");
			rev_regex2 = jsonData.rev_regex2.split("\n");
            ordering1 = jsonData.ordering1.split("\n");
            ordering2 = jsonData.ordering2.split("\n");

			} catch(err) {
				alert("Ahh an error! Please contact me via reddit.com/r/lingojam and I'll fix it asap. Error log: "+err.message);
			}

			evenUpSizes(phrases1,phrases2);
			evenUpSizes(words1,words2);
			evenUpSizes(intraword1,intraword2);
			evenUpSizes(prefixes1,prefixes2);
			evenUpSizes(suffixes1,suffixes2);

			//fix for mysql trailing newline deletion problem
			function evenUpSizes(a,b) {
				if(a.length > b.length) {
					while(a.length > b.length) b.push("");
				} else if(b.length > a.length) {
					while(b.length > a.length) a.push("");
				}
			}

			handleDuplicates(words1, words2);
			/* Initial translate for default text */
			if($('#english-text').val() != "") {
				var english = $('#english-text').val();
				var ghetto = translate(english);
				$('#ghetto-text').val(ghetto);
			}
		</script>

    <!-- preloader -->
    <div style="display:none;">
      <img id="$workerLoaderGif" src="" />
    </div>
    <script>
    window.addEventListener("load", function() {
      if(numRules() > 1000) $workerLoaderGif.src = "/img/loading_nice.gif";
    });
    </script>

		<!--<div class="feedback">
			<textarea placeholder="How can we improve LingoJam? Press enter to submit :)"></textarea>
		</div>
		<style>
			.feedback {
				position:fixed;
				width:240px;
				height: 50px;
				bottom:0px;
				right:0px;
			}
			.feedback textarea {
				width:100%;
				height:100%;
				padding-right: 5px;
			}
			.feedback-focus {
				height:200px;
			}
		</style>
		<script>
			$(document).ready(function() {
				/*==================================
						    SEND FEEDBACK
				  ==================================*/
					$('.feedback textarea').keypress(function(e) {
						if(e.which == 13) {
						e.preventDefault();
							var message = $('.feedback textarea').val();
							var subject = "LingoJam Feedback Form"
							$.post("/php/sendemail.php", { message:message, subject:subject})
								.done(function(data) {
									$('.feedback textarea').hide();
									alert("Thanks a heap for your feedback! We really appreciate it :)");
								})
								.fail(function(data) {
									alert("Sorry, something went wrong :| maybe try sending again? If it fails again, it'd be great if you could report this issue at reddit.com/r/lingojam :)");
								});
						}
					});



				/*==================================
				    TEXT AREA FOCUS HEIGHT CHANGE
				  ==================================*/
				$('.feedback textarea').blur(function(){
							$('.feedback').removeClass("feedback-focus");
							$('.feedback textarea').attr('placeholder',"How can we improve LingoJam? Press enter to submit :)");
					})
						 .focus(function() {
							$('.feedback').addClass("feedback-focus")
							$('.feedback textarea').attr('placeholder',"If you leave your email we'll get back to you about the question or problem or solution as soon as we can.");
					});

			});
		</script>-->

    <script>
      if($("div.intro").height() > 400) {
        $("div.intro").css("height","400px");
        $(".readmore-box").show();
      }

      $("#intro-read-more-button").click(function() {
        $(".readmore-box").hide();
        $("div.intro").css("height","auto");
      })
    </script>


		<!-- Global site tag (gtag.js) - Google Analytics -->
    <script async src="https://www.googletagmanager.com/gtag/js?id=G-JS3JTMYEBZ"></script>
    <script>
      window.dataLayer = window.dataLayer || [];
      function gtag(){dataLayer.push(arguments);}
      gtag('js', new Date());

      gtag('config', 'G-JS3JTMYEBZ');
    </script>

    <style>
        @media only screen and (max-width: 850px) {
          .main-title h1 {
            font-size: 6.5vw;
          }
        }
    </style>
    <script>
    document.querySelectorAll("a").forEach(function(el) {
      var url = el.getAttribute("href");
      if(!url.startsWith("http") && url.includes(".")) {
        el.href = "http://"+el.getAttribute("href")
      } 
    });
    </script>

    <script>
    // a guess to prevent confirmed-click stuff (sudden overscroll on mobile => next tap [intending to scroll] is on region below output textarea)
    if(window.innerHeight < 768) {
        setInterval(function() {
          let outputTextArea = document.querySelector("#ghetto-text");
          if(outputTextArea.scrollHeight > outputTextArea.offsetHeight*5) {
            outputTextArea.style.overscrollBehavior = "contain";
          } else {
            outputTextArea.style.overscrollBehavior = "";
          }
        }, 3000);
    }
    </script>


    <script>
      if(window.adProviderName === "sovrn") document.write(`<div class="sovrn-slider"></div>`);
      else if(window.adProviderName === "sortable") document.write(``);
      else if(window.adProviderName === "snigel") document.write(``);
      else if(window.adProviderName === "freestar") document.write(``);
    </script>

  </body>
</html>
