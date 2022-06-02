
(function (lib, img, cjs, ss) {

var p; // shortcut to reference prototypes
lib.webFontTxtFilters = {}; 

// library properties:
lib.properties = {
	width: 700,
	height: 310,
	fps: 24,
	color: "#FFFFFF",
	opacity: 1.00,
	webfonts: {},
	manifest: []
};



lib.ssMetadata = [];


lib.webfontAvailable = function(family) { 
	lib.properties.webfonts[family] = true;
	var txtFilters = lib.webFontTxtFilters && lib.webFontTxtFilters[family] || [];
	for(var f = 0; f < txtFilters.length; ++f) {
		txtFilters[f].updateCache();
	}
};
// symbols:



(lib.handfront = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#D1E233").s().p("AA6DCQgKgLgMgvQgiiEgiggQgygwgQgoIgHgfQAVhFAtAYQAmAWAoBQQApBOARBMQATBVgXAfQgOATgLAAQgGAAgEgFg");
	this.shape.setTransform(32.5,20);

	this.shape_1 = new cjs.Shape();
	this.shape_1.graphics.f("#B8D31A").s().p("AAhHGQAIhMgTg7QgFAvgxAxQhAA9hZgOQAygjAZiKQALg7gGgnQgHgqgaAAQguACgxA3QgYAbgQAcQgDgIgEgUQgIgoAAg8QAAhaBKgbQAdgKAhAEQAfADATAPQBahnhQjpQgohzg6hfIFxAnQA/DJgsC9QgWBcgiA2IAiAJQAoATAkAwQArBOgHBcQgIBig/A4QgEgLgMhGQgKg+gSgZQAMCBhRA/QgoAhgqAGQAHgbAEgng");
	this.shape_1.setTransform(28.9,66.8);

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.shape_1},{t:this.shape}]}).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,57.9,118.8);


(lib.handback = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#575E11").s().p("Ag4EuQAAgfAIgiIAIgbIg3AyQhEA1hCAPQgBhLAqhXIBHh7Qgrgdg8AXQgeALgWARQgDgUAFgZQAKgyAogjQAtgnBGAEQA9ADAwAgQA8g/gwiNQgWhHgkg7IBTgBQBogHBhgdQA1CMgjCKQgVBVg1BJQgTAbALAWQAGAOAYAfQAhA2gFBIQgEA3gfBqQgsgZgihEIgZg/IgIBGQgRBSgrA8QhUgjgChkg");
	this.shape.setTransform(16.6,26.5,0.606,0.606);

	this.timeline.addTween(cjs.Tween.get(this.shape).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,33.3,53);


(lib.Path_65 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#020202").s().p("AjuGoQjOh6hjiCQBCgvCIiSQDejxAfghQFVlfDbACQAhATATAQQAdBhgMCoQgNC3g4BbQhHBygQArQgZBGALBiQANBvhOEXQkwhNjwiQg");
	this.shape.setTransform(54.5,64.5);

	this.timeline.addTween(cjs.Tween.get(this.shape).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,109,129.1);


(lib.Path_17 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#020202").s().p("AgEAqIB5mSIh3KXQg3Ahg7AZQAig+BOkBg");
	this.shape.setTransform(11.8,36.1);

	this.timeline.addTween(cjs.Tween.get(this.shape).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,23.6,72.3);


(lib.dinosaur_1 = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// Слой 1
	this.shape = new cjs.Shape();
	this.shape.graphics.f("#333232").s().p("Ag6gjIBDgOIAyBLIhEAYg");
	this.shape.setTransform(193.6,262.6);

	this.shape_1 = new cjs.Shape();
	this.shape_1.graphics.f("#333232").s().p("Ai4h2ICZgeIDXDwIi5A5g");
	this.shape_1.setTransform(209.3,260);

	this.shape_2 = new cjs.Shape();
	this.shape_2.graphics.f("#85C8ED").s().p("AgvgcIADgMIBcBEIgEANg");
	this.shape_2.setTransform(225.2,239.7);

	this.shape_3 = new cjs.Shape();
	this.shape_3.graphics.f("#85C8ED").s().p("AgmgSIAEgMIBJAxIgGAMg");
	this.shape_3.setTransform(226.3,237);

	this.shape_4 = new cjs.Shape();
	this.shape_4.graphics.f("#2C9AE5").s().p("AimgFIBRjqID8C0IhhEqg");
	this.shape_4.setTransform(226.6,241.7);

	this.shape_5 = new cjs.Shape();
	this.shape_5.graphics.f("#444444").s().p("AhvC2IgWgcQhUimgmhKQgWgrAUgQIAZgIIDigsIEREmIk4BgQgNAFgMAAQgWAAgTgQg");
	this.shape_5.setTransform(208.1,262.2);

	this.shape_6 = new cjs.Shape();
	this.shape_6.graphics.f("#333232").s().p("AjGgDIBKjhQAFgXANgSQAagkAoAaQBEAuCEBeIAZAUQAXAbgOAjIh3Fcg");
	this.shape_6.setTransform(227.3,242.8);

	this.shape_7 = new cjs.Shape();
	this.shape_7.graphics.f("#D1E233").s().p("AiTBgQgWhAgGhOQgFhDCVgYQBJgLBMABQBagFgvAZQgcAPiqBBQg7AWgBBLIABA4QgBAdgNALQgDADgDAAQgOAAgRg1g");
	this.shape_7.setTransform(65.1,194.5);

	this.shape_8 = new cjs.Shape();
	this.shape_8.graphics.f("#6F8417").s().p("AgmAcQgHgFADgIQADgKAUgWQASgVATAJQAKAEAHAIQAMAJgEAJQgDAIgKAIQgEADgNgCQgMgBgEAHQgIAIgLABIgDAAQgHAAgGgFg");
	this.shape_8.setTransform(296,110.6);

	this.shape_9 = new cjs.Shape();
	this.shape_9.graphics.f("#6F8417").s().p("AhlBTQgdgHAIghQAHgfAbgDQAVgCAEgNQACgYADgTQAEgYAZgIQANgEALABQBWgEAeAbQAZAUgTAUQgEAFglALQgjAIgVAcQgXAigjAOQgTAHgTAAQgNAAgMgDg");
	this.shape_9.setTransform(544.5,206.2);

	this.shape_10 = new cjs.Shape();
	this.shape_10.graphics.f("#6F8417").s().p("AgZBcQgagQAGgfQAEgVgPgWQgYgkgFgMQgLgcATgOQAKgGAMgBQAfgGAiAKQAmALAaAXQAZAXgPAnQgNAmgmAkQgVATgRAAQgKAAgKgGg");
	this.shape_10.setTransform(296,91.6);

	this.shape_11 = new cjs.Shape();
	this.shape_11.graphics.f("#6F8417").s().p("AhPBRQgQgNAEgUQAGgNABgGQABgIgHggQgHghAZgVQANgKANgEQAugPAZAOQAHAEAqAqQAcAcgOAbQgMAZgcAGIgiAGQgPADgcAQQgSAKgNAAQgLAAgIgGg");
	this.shape_11.setTransform(142.9,70.9);

	this.shape_12 = new cjs.Shape();
	this.shape_12.graphics.f("#D1E233").s().p("AqtDPQiehHAch0QAahoA3gEQAbgCAWATQFBD0GGg+QCDgUCJg3QATgICKg+QA8gcD2irQBLgxgOAVQgQAaiVCGQkVD5k3BQQhwAdh+AIQg7AEiDAAQi6AAiIg+g");
	this.shape_12.setTransform(525.2,166.4);

	this.shape_13 = new cjs.Shape();
	this.shape_13.graphics.f("#6F8417").s().p("Ag/B5QgSgeAYhjIAchgQAJghAJAEQAHACAHAbQAbBOALAGQAYANAGAWQAFAYgPAUQgaAjgiAYQgXARgQAAQgQAAgJgOg");
	this.shape_13.setTransform(338.5,171.8);

	this.shape_14 = new cjs.Shape();
	this.shape_14.graphics.f("#D1E233").s().p("AC2BHQiVhglEgaIjWgNQhggGgQgMQgSgOAPgTQAOgRApgRQBhgmCQAAQCHgBC+AaQBhAMBFANQFIBWBUA1QAlAZAJAcQAEAQgCApQgCAXgaAVQgfAZgyAGQgOABgPAAQiAAAizh1g");
	this.shape_14.setTransform(307.6,40.1);

	this.shape_15 = new cjs.Shape();
	this.shape_15.graphics.f("#5A6614").s().p("AggANQgIgJADgJQADgKAPgGQAZgKATAYQAJALAFAOQgWAHgRAAQgTAAgNgMg");
	this.shape_15.setTransform(164.7,256.4);

	this.shape_16 = new cjs.Shape();
	this.shape_16.graphics.f("#8B9116").s().p("AgWA4QA0g6AnhkIAFgBIAsgVQgRBegmA0Qg8BXh4AQQAygSAtgzg");
	this.shape_16.setTransform(361.1,223.4);

	this.instance = new lib.Path_17();
	this.instance.setTransform(324.5,132.3,1,1,0,0,0,11.8,36.1);
	this.instance.alpha = 0.32;

	this.shape_17 = new cjs.Shape();
	this.shape_17.graphics.f("#FCE249").s().p("AgbAtQABgMAEgSQAJghAQgZQATgaAFARQABAGAAAmQgBAagbAcQgMAOgHAAQgHAAgBgPg");
	this.shape_17.setTransform(622.1,96.2);

	this.shape_18 = new cjs.Shape();
	this.shape_18.graphics.f("#F9DC32").s().p("AHQEGQjKgJj4hmQh7gzkaiTQjlh4hpgbQiBgih5AwQCPhYCfAGQDiAIE9C4QD9CSFTgUQCYgJCHgrQCHgqBchFQgTBegcCfQjEB1jlAAIgogBg");
	this.shape_18.setTransform(231.2,148);

	this.shape_19 = new cjs.Shape();
	this.shape_19.graphics.f("#FCE249").s().p("AgYAQQAAgHgPgbQgIgSAVAFQAYAEAVAPQAMAIAHAFQAPASgoALQgMADgGAAQgTAAAAgRg");
	this.shape_19.setTransform(594.9,74.5);

	this.shape_20 = new cjs.Shape();
	this.shape_20.graphics.f("#FCE249").s().p("AgDAmQgmgPAOgTQAFgEAFghQAEgTANARQAQASAJAYQAFANACAJQAAAPgOAAQgIAAgNgGg");
	this.shape_20.setTransform(614.9,78.8);

	this.shape_21 = new cjs.Shape();
	this.shape_21.graphics.f("#FCE249").s().p("AgeBNQgVgBgBgTQABgQAGgYQAMgsAYghQAVgfAJAgQAQA3AIAGQAOAPgMATQgLARgZAMQgUAMgSAAIgDAAg");
	this.shape_21.setTransform(606.5,119.9);

	this.shape_22 = new cjs.Shape();
	this.shape_22.graphics.f("#FCE249").s().p("AghBPQgYgCgBgSQAAgSAFgYQAJguAZghQANgTAGAEQAGACAGATQAUA4ATAOQAQAMgOARQgMAPgcALQgWAKgTAAIgFAAg");
	this.shape_22.setTransform(572.8,142.1);

	this.shape_23 = new cjs.Shape();
	this.shape_23.graphics.f("#FCE249").s().p("AgeAzQgTggABgjIAFggQADgQATgCQASgBATAJQAVAKAIANQAJAOgPAKQgSALgVAwQgHARgFACIgCAAQgGAAgKgQg");
	this.shape_23.setTransform(380.7,261.9);

	this.shape_24 = new cjs.Shape();
	this.shape_24.graphics.f("#FCE249").s().p("AgmBBQgYgoACguIAGgnQADgVAZgCQAVgCAZANQAbAMAKAQQAMASgUAMQgXAOgaA9QgIAVgHACIgDAAQgIAAgMgTg");
	this.shape_24.setTransform(360.6,260.1);

	this.shape_25 = new cjs.Shape();
	this.shape_25.graphics.f("#CCB542").s().p("AghAwQgQggAEgiIAHgdQADgQATAAQAQAAASALQAUALAGAMQAIAOgPAIQgSAIgXAuQgIAPgFABIgCABQgGAAgIgQg");
	this.shape_25.setTransform(300.8,246.9);

	this.shape_26 = new cjs.Shape();
	this.shape_26.graphics.f("#CCB542").s().p("AgoAuQgMghAIghIALgdQAFgPATACQAOACASANQASANAGANQAFAPgQAGQgTAGgcAqQgJAOgGABIgBAAQgGAAgHgRg");
	this.shape_26.setTransform(285.8,241.1);

	this.shape_27 = new cjs.Shape();
	this.shape_27.graphics.f("#CCB542").s().p("AguBCQgIgBgCgWQgDgnAUghQAKgRAKgKQAKgOARAIQARAHAPATQAQATABAQQACAQgTABQgXACgrAlQgNALgGAAIgBAAg");
	this.shape_27.setTransform(273.3,233.8);

	this.shape_28 = new cjs.Shape();
	this.shape_28.graphics.f("#FCE249").s().p("AgsAyQgOglAJgkIAMggQAGgQAVACQAQACAUAPQAUAOAGAPQAGAQgSAHQgVAGgfAwQgLAPgGABIgBAAQgHAAgHgUg");
	this.shape_28.setTransform(336.6,253);

	this.shape_29 = new cjs.Shape();
	this.shape_29.graphics.f("#FCE249").s().p("AgoBXQgagIACgXQgCgSAEgZQAKgyAjglQASgUAJAFQAHAEAEAZQAPBIAVAVQASARgRARQgOAOggAHQgNADgNAAQgPAAgLgEg");
	this.shape_29.setTransform(527.5,152.9);

	this.shape_30 = new cjs.Shape();
	this.shape_30.graphics.f("#FCE249").s().p("AgNBNQgfgKgQgSQgTgUANgTIAYgiQAigoAvgOQAbgIAFAJQAEAHgIAXQgYBGAIAcQAHAYgXAGQgHACgJAAQgPAAgRgGg");
	this.shape_30.setTransform(484.3,150);

	this.shape_31 = new cjs.Shape();
	this.shape_31.graphics.f("#FCE249").s().p("AhZBzQgRgTgMgkQgYhFAXhUQANgvAVgDQARgCAfAbIA9A5QAqAiAkALQApAMgQAjQgOAigvAiQgwAkgqAHQgKACgIAAQgjAAgMgdg");
	this.shape_31.setTransform(94.1,47.6);

	this.shape_32 = new cjs.Shape();
	this.shape_32.graphics.f("#FCE249").s().p("AgXCBQgdgUgfgnQg9hKgHhWQgEgwAYgFQASgEAtAXIBWArQA3AXAmgCQArgDgCApQgCAighAxQghAygmAVQgVAMgRAAQgRAAgOgPg");
	this.shape_32.setTransform(45.7,92.8);

	this.shape_33 = new cjs.Shape();
	this.shape_33.graphics.f("#FCE249").s().p("AAZBVQgZgIgdgVQg9gpgYg6QgNgiAQgJQAMgGAlAGIBHALQAtAFAbgLQAegLAHAeQAHAagNApQgMArgXAYQgRASgRAAQgJAAgJgFg");
	this.shape_33.setTransform(20.5,138.1);

	this.shape_34 = new cjs.Shape();
	this.shape_34.graphics.f("#FCE249").s().p("AAkBPQgYgFgcgQQg7gggcgzQgPgdANgKQALgHAiACIBCAEQApAAAYgMQAagNAKAaQAJAYgIAoQgIAmgSAYQgPAUgRAAQgHAAgHgDg");
	this.shape_34.setTransform(11.3,177.8);

	this.shape_35 = new cjs.Shape();
	this.shape_35.graphics.f("#FCE249").s().p("AANBTQhAgKgsgpQgZgXAKgLQAHgKAigKIBBgTQAkgOATgTQAUgVASAVQAQAUAHAoQAFAmgIAdQgLAigbgCIgUABQgRAAgVgDg");
	this.shape_35.setTransform(11.5,215.8);

	this.shape_36 = new cjs.Shape();
	this.shape_36.graphics.f("#383838").s().p("AgQAiQgGgHgDgMQgHgWANgaQALAMAOALQAOAKAJABQgEAMgJAJQgNAMgSAAIgBAAg");
	this.shape_36.setTransform(73.1,253.9);

	this.shape_37 = new cjs.Shape();
	this.shape_37.graphics.f("#FFFFFF").s().p("AgkAkQgQgPAAgVQAAgUAQgPQAQgPAUAAQAWAAAPAPQAQAPAAAUQAAAVgQAPQgPAPgWAAQgUAAgQgPg");
	this.shape_37.setTransform(71.1,252.3);

	this.shape_38 = new cjs.Shape();
	this.shape_38.graphics.f("#6F8417").s().p("AgBAeQgagLgBgPQgBgGAKgOQAQgXAQALQAWAOgHAXQgDAPgJAGQgEACgGAAQgEAAgDgCg");
	this.shape_38.setTransform(565.7,197.7);

	this.shape_39 = new cjs.Shape();
	this.shape_39.graphics.f("#6F8417").s().p("AgEA0QgsgTgBgZQgBgMAPgYQANgSAMgGQAOgHASALQATAMAHASQAFAPgFAUQgGAZgPAKQgHAEgJAAQgIAAgHgEg");
	this.shape_39.setTransform(518,208);

	this.shape_40 = new cjs.Shape();
	this.shape_40.graphics.f("#6F8417").s().p("AgEAgQgbgNAAgQQAAgHALgOQASgZARAOQAWAQgIAZQgEAQgKAFQgEACgFAAQgFAAgFgDg");
	this.shape_40.setTransform(345.7,158.4);

	this.shape_41 = new cjs.Shape();
	this.shape_41.graphics.f("#6F8417").s().p("AgZAwQgQgGgFgUQgLgsAUgRQAKgJAbgBQAwgDADAlQADApgpASQgNAHgMAAQgHAAgGgDg");
	this.shape_41.setTransform(312.7,103.7);

	this.shape_42 = new cjs.Shape();
	this.shape_42.graphics.f("#6F8417").s().p("AgKAUQgGgDgCgIQgFgRAIgHQAFgEAKgBQAUgBABAQQABAQgRAHQgFADgFAAIgFgBg");
	this.shape_42.setTransform(279,91.5);

	this.shape_43 = new cjs.Shape();
	this.shape_43.graphics.f("#6F8417").s().p("AgKAUQgGgDgCgIQgFgSAIgHQAEgEALAAQAUgBABAPQACAQgSAIQgFADgEAAIgGgBg");
	this.shape_43.setTransform(54.3,235.2);

	this.shape_44 = new cjs.Shape();
	this.shape_44.graphics.f("#6F8417").s().p("AgUAqQgLgHgEgQQgIgiAOgRQAKgNATAAQANgBAMAKQAMAKABARQACAQgJAPQgIAOgPAHQgIADgGAAQgIAAgGgEg");
	this.shape_44.setTransform(146.9,86.8);

	this.shape_45 = new cjs.Shape();
	this.shape_45.graphics.f("#6F8417").s().p("AgUAqQgLgHgEgQQgIgiAOgRQALgNASAAQANgBAMAKQAMAKABARQACAQgJAPQgIAOgPAHQgIADgGAAQgIAAgGgEg");
	this.shape_45.setTransform(63.1,228.8);

	this.shape_46 = new cjs.Shape();
	this.shape_46.graphics.f("#6F8417").s().p("AgEBjQhVgigOg2QgLgkAZgnQAUgfAlgJQAlgJAkAVQAmAWARAmQAQAjgHAoQgJAugiAOQgNAFgOAAQgTAAgUgJg");
	this.shape_46.setTransform(67.7,248.5);

	this.shape_47 = new cjs.Shape();
	this.shape_47.graphics.f("#6D6D6D").s().p("AiHBWIhYiVQgpBLgDAIIgDAFIgFAAQgWgFggAFIgEgRQAfgCAXACIAyhaIAGgMIBcCcQALgmAUgoQAQggAIgIIAGgJIAFAKQAPAXA3AxIAahuIAJAKIBOBMQAFgUAOgfIAQggIAEgIIAIAFIAXAVQAXAVAKAPIAjhAIADgBQAKAAAJADQAWAHAZAUIAJAcQgUgSgXgNQgTgLgHgBIgtBUIgGgQQgHgSgtgnQgfA/gBATIgBASIhZhYIgaBrIgJgIQg0gtgYgdQgjA6gPA/IgFATg");
	this.shape_47.setTransform(119.5,217.3);

	this.shape_48 = new cjs.Shape();
	this.shape_48.graphics.f("#FFFFFF").s().p("AkwCYQgUgbgKg4QgNhAgHgNQgqheACghQAFg5BsAXQBmAWD4gbQB8gOBpgSQgVCNB2CqQgjgLgUABQgSAAgkALQitA0iCAeQhUATg8AAQhoAAgng3g");
	this.shape_48.setTransform(120.5,215.8);

	this.shape_49 = new cjs.Shape();
	this.shape_49.graphics.f("#6F8417").s().p("AkvCeQgSgcgNg7QgOg8gLgQQg+hiAIhDQAJhMBqAvQBVAmEHgIQCFgEBzgMQgOBaA+BoQAVAkAZAdQARAVAGACQglgGgZADQgTADgqAOQiPA0imAmQhPARg6AAQhsAAgpg8g");
	this.shape_49.setTransform(118.4,216.5);

	this.shape_50 = new cjs.Shape();
	this.shape_50.graphics.f("#8B9116").s().p("AhxBMQgLgQAlgVQBPgpAIgGQAKgJA9g3QAdgbALAQQAOAUgXAmQgXAkgvAhQgtAigrAJQgNADgLAAQgXAAgKgOg");
	this.shape_50.setTransform(98.2,55.5);

	this.shape_51 = new cjs.Shape();
	this.shape_51.graphics.f("#8B9116").s().p("AhaBoQgRgOAXglQAOgZAvg1QArg2AUgQQAegZARAOQATAQgNArQgNAqglAqQglAsglAUQgWALgQAAQgMAAgJgIg");
	this.shape_51.setTransform(53.8,98);

	this.shape_52 = new cjs.Shape();
	this.shape_52.graphics.f("#8B9116").s().p("AgyBjQgQgIAKghQAGgWAZgxQAZgzAKgRQASgaAQAIQASAJgBAjQgCAkgUAnQgUAqgZAXQgTARgPAAQgFAAgFgDg");
	this.shape_52.setTransform(29.3,138.5);

	this.shape_53 = new cjs.Shape();
	this.shape_53.graphics.f("#8B9116").s().p("AgUBsQgUgDgHgjQgHgjAJgrQAJgtAUgdQASgdAUADQATAEAHAjQAIAjgKArQgJAtgUAdQgRAagQAAIgEgBg");
	this.shape_53.setTransform(19.3,177.8);

	this.shape_54 = new cjs.Shape();
	this.shape_54.graphics.f("#8B9116").s().p("AgdAPQgNgFgBgIQAAgGAMgGQANgHASgBQARAAANAEQANAFABAHQABAHgNAGQgNAGgSACIgFAAQgOAAgLgEg");
	this.shape_54.setTransform(595.8,76.4);

	this.shape_55 = new cjs.Shape();
	this.shape_55.graphics.f("#8B9116").s().p("AgHARQgQgIgKgJQgJgKADgHQADgHAOAAQAOABAPAHQARAIAKAIQAJALgDAHQgEAHgOAAQgOAAgPgIg");
	this.shape_55.setTransform(615,81.7);

	this.shape_56 = new cjs.Shape();
	this.shape_56.graphics.f("#8B9116").s().p("AgmAuQgIgHAGgSQAFgTAQgRQAQgUAQgJQARgIAIAHQAJAGgGAUQgGASgQARQgPAUgQAIQgJAGgHAAQgGAAgEgEg");
	this.shape_56.setTransform(621.6,99.6);

	this.shape_57 = new cjs.Shape();
	this.shape_57.graphics.f("#8B9116").s().p("AhDAtQgIgMAOgWQAPgUAcgTQAagTAagFQAagEAIAMQAIAMgOAWQgPAUgcATQgaATgaAFIgNABQgPAAgGgJg");
	this.shape_57.setTransform(607,124.7);

	this.shape_58 = new cjs.Shape();
	this.shape_58.graphics.f("#8B9116").s().p("AhJAhQgHgNASgTQASgSAfgOQAdgOAaAAQAagBAHAOQAFANgRATQgSASgfAOQgdAOgaAAIgCAAQgZAAgFgNg");
	this.shape_58.setTransform(573.4,147.6);

	this.shape_59 = new cjs.Shape();
	this.shape_59.graphics.f("#8B9116").s().p("AgNAhQglgPgWgUQgWgVAHgQQAFgNAXAMIA6AfIBCASQAdAIgFANQgGAQgfABIgCAAQgdAAgigOg");
	this.shape_59.setTransform(482.5,155.7);

	this.shape_60 = new cjs.Shape();
	this.shape_60.graphics.f("#8B9116").s().p("Ag8AoQgegHgDgRQgDgQAagQQAZgQAogHQAlgHAeAHQAeAHACARQADAPgZARQgaARgnAGQgRAEgRAAQgSAAgPgEg");
	this.shape_60.setTransform(527.5,160.5);

	this.shape_61 = new cjs.Shape();
	this.shape_61.graphics.f("#8B9116").s().p("AgbBQQgQgfgDgvQgDgrAMgiQALghAUgBQASgCAQAgQAQAgADAuQADArgLAhQgMAigUABIgBABQgRAAgQgfg");
	this.shape_61.setTransform(20.4,215.8);

	this.shape_62 = new cjs.Shape();
	this.shape_62.graphics.f("#B8D31A").s().p("A4FVUQjMgRiagkQhigYACgqQABgbAngeQATgPgJgSIglg3QhDhygnjdIgZjHQgHgoAAhGQABiLAiiWQBtnbGamKQGnmWI9igQE0hWGSgOQGngPGkBJQKlB3EHE9QEJE/haFpQggCChJBxQg7Bbg3ArQgjAcg9AkIhhA7QhpBDgFA3QgDAfARAIQANAGAigFIA/gKQAogDAbAMQA6AYgQBhQgLA+g+CjQgVA3gJA8QgFAigEA2QgGArgNAWQgRAdgoASQhaApgmgrQgMgOgGgVIgDgRQgPARg8AbQg2AWgtgaQgggTgXgpQggAngwAGQguAFgkgcQgbgtAHguQAKhIBrgGQBogGBPh2QAog7ASg5Qg4AahFARQiLAjhDgwQiNhkACjjQABhHAPhLIAPg9QjWCAj7gLQjKgIj4hnQh7gzkaiTQjlh5hpgbQjxg/jWDdQhEBFhGBqIhPB4QEjhNCjBMQA3AaAoAsQAOAPAdAsQAXAjgFAXQgDARgRAIQgVCNB2CsQAKgDALAKQAPAOAAAdQgBA1APAtQAKAdAfBNQAmAqAGAdQADATgKAVQgIAQgbADQgeAEgagRQhwAxhiApQi9BOh3ATQhcAOh1AAQhZAAhngIg");
	this.shape_62.setTransform(226.1,146.3);

	this.shape_63 = new cjs.Shape();
	this.shape_63.graphics.f("#575E11").s().p("ABDJKQgTgQgJgYQgIgXAFgSQhBAugogZQghgUAJglQgpAYgLABQgkAFgbgyQgWgqAfgbQAXgVA+gSQAcgJA5g6QA8hAAeg7QAkhJgigjQgpgqiLAUQjZAghIkkQgXhcgFhxIgBhfIFfgqQFpgkA6AaQBbBdAJDgQAFCLgbCsQgbCnglBwQg+C7hhBGQgqAegiAAQgaAAgVgRg");
	this.shape_63.setTransform(290.9,187.7);

	this.instance_1 = new lib.Path_65();
	this.instance_1.setTransform(384,164,1,1,0,0,0,54.5,64.5);
	this.instance_1.alpha = 0.379;

	this.shape_64 = new cjs.Shape();
	this.shape_64.graphics.f("#B8D31A").s().p("AurKhQjnhSi1h4QifhphRhqQBEgwCUiiQDSjjA+g/QCoinCDhMQCkhgCCAfIAmBfQAzBxBHBeQDiEoFLgRQGygWEMjTQBlhRA6hfQAzhRADg9QAGiKijgKQg0gDg+AKIgzAKIAngsQA0gyBCgdQDThfEOCUQCfBXgFDgQgFDZibD2QilEIkNC7QkvDTlrA4QjqAljcAAQmuAAmDiJg");
	this.shape_64.setTransform(488.7,155.2);

	this.shape_65 = new cjs.Shape();
	this.shape_65.graphics.f("#FCE249").s().p("Ag9BvQgjgPAFgdQAAgbAJgkQAThEAygrQAZgYAOAMQAKAJAGAmIANBIQAKAqATAXQAUAYgZARQgXAPgsACIgJABQglAAgbgNg");
	this.shape_65.setTransform(246.9,12.4);

	this.shape_66 = new cjs.Shape();
	this.shape_66.graphics.f("#FCE249").s().p("Ag9BvQgjgPAFgdQAAgbAJgkQAThEAygrQAZgYAOAMQAKAJAGAmIANBIQAKAqATAXQAUAYgZARQgXAPgsACIgJABQglAAgbgNg");
	this.shape_66.setTransform(193.3,12.4);

	this.shape_67 = new cjs.Shape();
	this.shape_67.graphics.f("#FCE249").s().p("AAKBxQgZgCgkgbQgkgagPgeQgRggAWgTIAugrQA5gsBBgCQAkgCADASQACAOgSAhIgjA/QgTApAAAdQABAdgaAAIgFAAg");
	this.shape_67.setTransform(452.4,128.5);

	this.shape_68 = new cjs.Shape();
	this.shape_68.graphics.f("#FCE249").s().p("AgMBrQgagGggggQgggfgKggQgMgiAZgPIA0gkQA/giBBAHQAkAEAAASQAAAOgXAeQgeAmgPATQgZAlgEAdQgDAZgTAAIgKgBg");
	this.shape_68.setTransform(431.8,92.8);

	this.shape_69 = new cjs.Shape();
	this.shape_69.graphics.f("#FCE249").s().p("AgvB7QgmgGgCgdQgIgaAAglQAAhHAlg2QAVgeAQAIQAMAGAOAjIAfBDQAVAlAYARQAaATgUAXQgTAUgqANQgcAKgZAAQgLAAgJgCg");
	this.shape_69.setTransform(146.9,21.2);

	this.shape_70 = new cjs.Shape();
	this.shape_70.graphics.f("#A0501A").s().p("AoLDUQipgZhhgsQhugyBBgqQA7gmA/gPQAfgJAUgBQBrgPHkhjQHPhfAlgDQC3gQB6ArQBeAhAVAwQAcA9g6A3QgrAqhMAdQgyAWgeAKQgtAPiQAhQj9A7kNAPQhTAFhMAAQiXAAh7gSg");
	this.shape_70.setTransform(111.3,263.4);

	this.shape_71 = new cjs.Shape();
	this.shape_71.graphics.f("#A0501A").s().p("AvVMGQhDAUgXAEQgFgighgkQgigigggGQgagEhAAOIg6AOQADgNAAgPQAAgfgRgLQBNg+iVAKQh1AIg/ASQgfAUgUAJQgmARgJggQgQg9hNAMQgfAKgMACQgUACAAgaQABgdgagKQgXgKg2ADQgsACACgPIALgQICqhjQCwhlAZgJQAagKFtimIFpijIA9g5QBQhBBhgoQE3h/FqCwQFwCvKOlcQDVhzDkikQBNg2Cfh8QCZAtA0BkQAvBZgnB7QgjByhkB4QhgB0iBBaQj0CqgyAfQjOCBjLBEQi/BAkMAhQikATjTAJQh7AFhKAOQh6AYh7A/QhwA6izA0QiqAuglANQgwgjhCALg");
	this.shape_71.setTransform(466.1,188.7);

	this.shape_72 = new cjs.Shape();
	this.shape_72.graphics.f("#A0501A").s().p("AgXgSIiagpQCshABuBFQAuAbASAoQARApgQAlQgig7ifgyg");
	this.shape_72.setTransform(587.4,96.1);

	this.shape_73 = new cjs.Shape();
	this.shape_73.graphics.f("#232323").s().p("Aj0FQQgOgUAahaIAdhVICBk8IApioIAPAAQARADALAIIDWCOIASATQAOAbgMAnIhwFmIkyBWQgLAEgOABIgKAAQgWAAgNgIg");
	this.shape_73.setTransform(223.3,248.1);

	this.shape_74 = new cjs.Shape();
	this.shape_74.graphics.f("#A0501A").s().p("AoYhaIEihDQEzhGBbgRQBcgRA9AXQAeAMAMAQIAMAHQAcAWBSBNQBSBMgQAmQgIATgZAFQm9B0hXAbQg4ARiXAfIiMAbg");
	this.shape_74.setTransform(241.4,257.2);

	this.timeline.addTween(cjs.Tween.get({}).to({state:[{t:this.shape_74},{t:this.shape_73},{t:this.shape_72},{t:this.shape_71},{t:this.shape_70},{t:this.shape_69},{t:this.shape_68},{t:this.shape_67},{t:this.shape_66},{t:this.shape_65},{t:this.shape_64},{t:this.instance_1},{t:this.shape_63},{t:this.shape_62},{t:this.shape_61},{t:this.shape_60},{t:this.shape_59},{t:this.shape_58},{t:this.shape_57},{t:this.shape_56},{t:this.shape_55},{t:this.shape_54},{t:this.shape_53},{t:this.shape_52},{t:this.shape_51},{t:this.shape_50},{t:this.shape_49},{t:this.shape_48},{t:this.shape_47},{t:this.shape_46},{t:this.shape_45},{t:this.shape_44},{t:this.shape_43},{t:this.shape_42},{t:this.shape_41},{t:this.shape_40},{t:this.shape_39},{t:this.shape_38},{t:this.shape_37},{t:this.shape_36},{t:this.shape_35},{t:this.shape_34},{t:this.shape_33},{t:this.shape_32},{t:this.shape_31},{t:this.shape_30},{t:this.shape_29},{t:this.shape_28},{t:this.shape_27},{t:this.shape_26},{t:this.shape_25},{t:this.shape_24},{t:this.shape_23},{t:this.shape_22},{t:this.shape_21},{t:this.shape_20},{t:this.shape_19},{t:this.shape_18},{t:this.shape_17},{t:this.instance},{t:this.shape_16},{t:this.shape_15},{t:this.shape_14},{t:this.shape_13},{t:this.shape_12},{t:this.shape_11},{t:this.shape_10},{t:this.shape_9},{t:this.shape_8},{t:this.shape_7},{t:this.shape_6},{t:this.shape_5},{t:this.shape_4},{t:this.shape_3},{t:this.shape_2},{t:this.shape_1},{t:this.shape}]}).wait(1));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(0,0,665,286.4);


// stage content:
(lib.dinosaur = function(mode,startPosition,loop) {
	this.initialize(mode,startPosition,loop,{});

	// hand-front.svg
	this.instance = new lib.handfront();
	this.instance.setTransform(244.9,137.5,0.569,0.569,0,0,0,28.9,0.1);

	this.timeline.addTween(cjs.Tween.get(this.instance).wait(1).to({regY:59.4,rotation:12.8,x:237.4,y:170.4},0).wait(1).to({rotation:25.6,x:230.2,y:167.8},0).wait(1).to({rotation:38.4,x:223.9,y:163.8},0).wait(1).to({rotation:51.2,x:218.5,y:158.5},0).wait(1).to({rotation:38,x:224.1,y:164},0).wait(1).to({rotation:24.8,x:230.6,y:168},0).wait(1).to({rotation:11.6,x:238,y:170.5},0).wait(1).to({rotation:-1.6,x:245.8,y:171.2},0).wait(1).to({rotation:-14.8,x:253.4,y:170},0).wait(1).to({rotation:-4.8,x:247.7,y:171.1},0).wait(1).to({rotation:5.2,x:241.7,y:171},0).wait(1).to({rotation:15.2,x:236,y:170},0).wait(1).to({rotation:25.2,x:230.4,y:167.9},0).wait(1).to({rotation:35.2,x:225.3,y:165},0).wait(1).to({rotation:45.2,x:220.9,y:161.2},0).wait(1).to({rotation:35.7,x:225.2,y:164.8},0).wait(1).to({rotation:26.2,x:230,y:167.7},0).wait(1).to({rotation:16.7,x:235.2,y:169.7},0).wait(1).to({rotation:7.2,x:240.6,y:170.9},0).wait(1).to({rotation:-2.3,x:246.2,y:171.2},0).wait(1).to({rotation:-11.8,x:251.7,y:170.5},0).wait(1).to({rotation:0.9,x:244.4,y:171.1},0).wait(1).to({rotation:13.6,x:236.9,y:170.2},0).wait(1).to({rotation:26.3,x:229.9,y:167.7},0).wait(1).to({rotation:39,x:223.6,y:163.6},0).wait(1).to({rotation:51.8,x:218.3,y:158.3},0).wait(1).to({rotation:35.2,x:225.4,y:165},0).wait(1).to({rotation:18.6,x:234.1,y:169.4},0).wait(1).to({rotation:2,x:243.7,y:171.1},0).wait(1).to({rotation:-14.6,x:253.4,y:170.1},0).wait(1).to({rotation:1.9,x:243.8,y:171.2},0).wait(1).to({rotation:18.4,x:234.2,y:169.5},0).wait(1).to({rotation:34.9,x:225.5,y:165.1},0).wait(1).to({rotation:51.4,x:218.5,y:158.4},0).wait(1).to({rotation:33.4,x:226.3,y:165.6},0).wait(1).to({rotation:15.4,x:235.9,y:169.9},0).wait(1).to({rotation:-2.6,x:246.3,y:171.1},0).wait(1).to({rotation:5.3,x:241.7,y:171},0).wait(1).to({rotation:13.1,x:237.2,y:170.3},0).wait(1).to({rotation:21,x:232.8,y:169},0).wait(30));

	// hand-back.svg
	this.instance_1 = new lib.dinosaur_1();
	this.instance_1.setTransform(352,157.3,1,1,0,0,0,332.4,143.2);

	this.timeline.addTween(cjs.Tween.get(this.instance_1).wait(70));

	// Слой 15
	this.instance_2 = new lib.handback();
	this.instance_2.setTransform(222.5,146.8,1,1,0,0,0,25.1,1);

	this.timeline.addTween(cjs.Tween.get(this.instance_2).wait(1).to({regX:16.6,regY:26.5,rotation:-7.1,x:217.1,y:173.1},0).wait(1).to({rotation:-14.2,x:220.5,y:173.6},0).wait(1).to({rotation:-21.3,x:223.8},0).wait(1).to({rotation:-28.4,x:227.1,y:173.2},0).wait(1).to({rotation:-35.4,x:230.3,y:172.4},0).wait(1).to({rotation:-42.5,x:233.5,y:171.3},0).wait(1).to({rotation:-28.8,x:227.3,y:173.2},0).wait(1).to({rotation:-15.1,x:220.9,y:173.6},0).wait(1).to({rotation:-1.4,x:214.6,y:172.5},0).wait(1).to({rotation:12.3,x:208.7,y:169.9},0).wait(1).to({rotation:26,x:203.6,y:165.9},0).wait(1).to({rotation:14.2,x:208,y:169.4},0).wait(1).to({rotation:2.4,x:212.9,y:171.9},0).wait(1).to({rotation:-9.5,x:218.2,y:173.3},0).wait(1).to({rotation:-21.3,x:223.8,y:173.6},0).wait(1).to({rotation:-33.2,x:229.3,y:172.7},0).wait(1).to({rotation:-45,x:234.5,y:170.8},0).wait(1).to({rotation:-31,x:228.3,y:172.9},0).wait(1).to({rotation:-16.9,x:221.8,y:173.6},0).wait(1).to({rotation:-2.9,x:215.3,y:172.6},0).wait(1).to({rotation:11.2,x:209.2,y:170.1},0).wait(1).to({rotation:25.2,x:203.8,y:166.1},0).wait(1).to({rotation:39.3,x:199.7,y:161.1},0).wait(1).to({rotation:23.8,x:204.4,y:166.7},0).wait(1).to({rotation:8.3,x:210.4,y:170.7},0).wait(1).to({rotation:-7.2,x:217.2,y:173.1},0).wait(1).to({rotation:-22.7,x:224.4,y:173.6},0).wait(1).to({rotation:-38.2,x:231.6,y:172.1},0).wait(1).to({rotation:-19.4,x:222.9,y:173.6},0).wait(1).to({rotation:-0.6,x:214.2,y:172.3},0).wait(1).to({rotation:18.1,x:206.4,y:168.3},0).wait(1).to({rotation:36.9,x:200.3,y:162},0).wait(1).to({rotation:14.8,x:207.7,y:169.2},0).wait(1).to({rotation:-7.3,x:217.2,y:173.1},0).wait(1).to({rotation:-29.4,x:227.6},0).wait(1).to({rotation:-6.1,x:216.7,y:173},0).wait(1).to({rotation:17.1,x:206.8,y:168.6},0).wait(1).to({rotation:40.4,x:199.4,y:160.7},0).wait(1).to({rotation:30.4,x:202.2,y:164.4},0).wait(1).to({rotation:20.4,x:205.6,y:167.7},0).wait(1).to({rotation:10.4,x:209.5,y:170.3},0).wait(29));

}).prototype = p = new cjs.MovieClip();
p.nominalBounds = new cjs.Rectangle(369.6,169.1,665,286.4);

})(lib = lib||{}, images = images||{}, createjs = createjs||{}, ss = ss||{});
var lib, images, createjs, ss;console.log("\u002f\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u000d\u000a\u0020\u002a\u0009\u0009\u0009\u0009\u0009\u0009\u0009\u0009\u0009\u0009\u0009\u0009\u0009\u0009\u0009\u0009\u002a\u0009\u0009\u000d\u000a\u0020\u002a\u0020\u0009\u0009\u0009\u0009\u0009\u0009\u0020\u0020\u0020\u0020\u0020\u0020\u4ee3\u7801\u5e93\u0009\u0009\u0009\u0009\u0009\u0009\u0009\u002a\u000d\u000a\u0020\u002a\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0077\u0077\u0077\u002e\u0064\u006d\u0061\u006b\u0075\u002e\u0063\u006f\u006d\u0009\u0009\u0009\u0009\u0009\u0009\u0009\u002a\u000d\u000a\u0020\u002a\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0009\u0009\u0020\u0020\u52aa\u529b\u521b\u5efa\u5b8c\u5584\u3001\u6301\u7eed\u66f4\u65b0\u63d2\u4ef6\u4ee5\u53ca\u6a21\u677f\u0009\u0009\u0009\u002a\u000d\u000a\u0020\u002a\u0020\u0009\u0009\u0009\u0009\u0009\u0009\u0009\u0009\u0009\u0009\u0009\u0009\u0009\u0009\u0009\u0009\u002a\u000d\u000a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002a\u002f");