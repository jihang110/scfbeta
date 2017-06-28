/******/ (function(modules) { // webpackBootstrap
/******/ 	// The module cache
/******/ 	var installedModules = {};
/******/
/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {
/******/
/******/ 		// Check if module is in cache
/******/ 		if(installedModules[moduleId]) {
/******/ 			return installedModules[moduleId].exports;
/******/ 		}
/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = installedModules[moduleId] = {
/******/ 			i: moduleId,
/******/ 			l: false,
/******/ 			exports: {}
/******/ 		};
/******/
/******/ 		// Execute the module function
/******/ 		modules[moduleId].call(module.exports, module, module.exports, __webpack_require__);
/******/
/******/ 		// Flag the module as loaded
/******/ 		module.l = true;
/******/
/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}
/******/
/******/
/******/ 	// expose the modules object (__webpack_modules__)
/******/ 	__webpack_require__.m = modules;
/******/
/******/ 	// expose the module cache
/******/ 	__webpack_require__.c = installedModules;
/******/
/******/ 	// identity function for calling harmony imports with the correct context
/******/ 	__webpack_require__.i = function(value) { return value; };
/******/
/******/ 	// define getter function for harmony exports
/******/ 	__webpack_require__.d = function(exports, name, getter) {
/******/ 		if(!__webpack_require__.o(exports, name)) {
/******/ 			Object.defineProperty(exports, name, {
/******/ 				configurable: false,
/******/ 				enumerable: true,
/******/ 				get: getter
/******/ 			});
/******/ 		}
/******/ 	};
/******/
/******/ 	// getDefaultExport function for compatibility with non-harmony modules
/******/ 	__webpack_require__.n = function(module) {
/******/ 		var getter = module && module.__esModule ?
/******/ 			function getDefault() { return module['default']; } :
/******/ 			function getModuleExports() { return module; };
/******/ 		__webpack_require__.d(getter, 'a', getter);
/******/ 		return getter;
/******/ 	};
/******/
/******/ 	// Object.prototype.hasOwnProperty.call
/******/ 	__webpack_require__.o = function(object, property) { return Object.prototype.hasOwnProperty.call(object, property); };
/******/
/******/ 	// __webpack_public_path__
/******/ 	__webpack_require__.p = "";
/******/
/******/ 	// Load entry module and return exports
/******/ 	return __webpack_require__(__webpack_require__.s = 31);
/******/ })
/************************************************************************/
/******/ ([
/* 0 */
/***/ (function(module, exports) {

module.exports = jQuery;

/***/ }),
/* 1 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


__webpack_require__(26);

__webpack_require__(25);

var _jquery = __webpack_require__(0);

var _jquery2 = _interopRequireDefault(_jquery);

var _log = __webpack_require__(24);

var _log2 = _interopRequireDefault(_log);

var _EventProxy = __webpack_require__(8);

var _EventProxy2 = _interopRequireDefault(_EventProxy);

var _Client = __webpack_require__(7);

var _Client2 = _interopRequireDefault(_Client);

var _artTemplate = __webpack_require__(6);

var _artTemplate2 = _interopRequireDefault(_artTemplate);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { 'default': obj }; }

var framework = {
    settings: __webpack_require__(9),

    log: _log2['default'],

    utils: {
        regs: {},

        crypto: __webpack_require__(23),

        getBrowserInfo: function getBrowserInfo() {
            var ua = navigator.userAgent.toLowerCase(),
                rMsie = /(msie\s|trident.*rv:)([\w.]+)/,
                rFirefox = /(firefox)\/([\w.]+)/,
                rOpera = /(opera).+version\/([\w.]+)/,
                rChrome = /(chrome)\/([\w.]+)/,
                rSafari = /version\/([\w.]+).*(safari)/,
                match;

            match = rMsie.exec(ua);
            if (match != null) {
                return { browser: "IE", version: match[2] || "0", ua: navigator.userAgent };
            }

            match = rFirefox.exec(ua);
            if (match != null) {
                return { browser: match[1] || "", version: match[2] || "0", ua: navigator.userAgent };
            }

            match = rOpera.exec(ua);
            if (match != null) {
                return { browser: match[1] || "", version: match[2] || "0", ua: navigator.userAgent };
            }

            match = rChrome.exec(ua);
            if (match != null) {
                return { browser: match[1] || "", version: match[2] || "0", ua: navigator.userAgent };
            }

            match = rSafari.exec(ua);
            if (match != null) {
                return { browser: match[2] || "", version: match[1] || "0", ua: navigator.userAgent };
            }

            if (match != null) {
                return { browser: "", version: "0", ua: navigator.userAgent };
            }
        },

        random: function random(digit) {
            var result = "";
            while (digit-- !== 0) {
                result += Math.floor(Math.random() * 10);
            }
            return result;
        },

        scrollTo: function scrollTo(el, offeset) {
            var pos = el ? el.offset().top : 0;
            (0, _jquery2['default'])('html,body').animate({
                scrollTop: pos + (offeset ? offeset : 0)
            }, 'slow');
        },

        loadJS: function loadJS(source, targetObj) {
            var target = targetObj || (0, _jquery2['default'])("body");
            target.append("<script type=\"text/javascript\" src=\"" + source + "\"></script>");
        },

        loadCSS: function loadCSS(source, targetObj) {
            var target = targetObj || (0, _jquery2['default'])("body");
            target.append("<link rel=\"stylesheet\" href=\"" + source + "\" />");
        },

        form: {
            extractAsSerializedArray: function extractAsSerializedArray(formId, filtEmpty) {
                eb.log.debug("Start to extract form data form '" + formId + "'.");

                filtEmpty = filtEmpty || false;
                var form = (0, _jquery2['default'])("#" + formId);

                if (typeof formId == "undefined" || form.length == 0) {
                    eb.log.debug("Cannot find form '" + formId + "', abort form data extraction!");
                    return false;
                }

                /*// 解锁
                if (eb.component.RichInput)
                {
                    form.EBRichForm("unlock", {filtSelector: "[data-readonly='true']", keepAttr: true});
                }
                form.find("[data-readonly='true']").removeAttr("disabled");*/

                var formDataRaw = form.serializeArray();

                // 加锁
                /*if (eb.component.RichInput)
                {
                    form.EBRichForm("lock", {filtSelector: "[data-readonly='true']", keepAttr: false});
                }
                form.find("[readonly]").attr("disabled", "disabled");*/

                var formData = [];

                for (var i = 0; i < formDataRaw.length; i++) {
                    var valRaw = formDataRaw[i].value;
                    try {
                        valRaw = valRaw.replace(/\r\n/g, "<BR>");
                        valRaw = valRaw.replace(/\n/g, "<BR>");
                        formDataRaw[i].value = valRaw;
                    } catch (e) {
                        eb.log.debug(e);
                    }

                    if (formDataRaw[i].name != "null") formData.push(formDataRaw[i]);
                }

                if (!filtEmpty) return formData;

                var data = [];

                for (var i = 0; i < formData.length; i++) {
                    if (formData[i].value.trim() != "") data.push(formData[i]);
                }

                return data;
            },

            /**
             * 提取表单数据为简单键值对<br/>
             * 输入控件的 name 做 key 值。
             * @static
             * @method extractAsKVMap
             * @for eb.utils.form
             * @param {String} formId [必选] 表单ID
             * @param {boolean} filtEmpty [可选] [默认：false] 是否过滤空字段
             * @param {String} valueSep [可选] [默认：eb.settings.MUTI_VAL_SEP] 同名字段分隔符
             * @return {Object} 以简单键值对形式表示的表单值<br/>
             * <pre>
             * {'firstname': 'Hello', 'lastname': 'World'}
             * </pre>
             */
            extractAsKVMap: function extractAsKVMap(formId, filtEmpty, useFilter, valueSep) {
                filtEmpty = filtEmpty || false;
                valueSep = valueSep || eb.settings.MUTI_VAL_SEP;
                useFilter = useFilter || false;

                var formData = eb.utils.form.extractAsSerializedArray(formId, filtEmpty);

                var data = {};

                for (var i = 0; i < formData.length; i++) {
                    if (typeof data[formData[i].name] == "undefined") {
                        data[formData[i].name] = formData[i].value;
                    } else {
                        data[formData[i].name] += valueSep + formData[i].value;
                    }
                }

                if (useFilter) {
                    (0, _jquery2['default'])("#" + formId).find("[rich-input][data-filter]").each(function () {
                        if ((0, _jquery2['default'])(this).attr("data-filter")) {
                            var filterName = (0, _jquery2['default'])(this).attr("data-filter");
                            var value = (0, _jquery2['default'])(this).EBRichInput("getValue", {});
                            var newValue = eb.utils.form.getValueViaFilter(value, filterName);
                            eb.log.debug("Filter '" + filterName + "' converted value '" + value + "' to '" + newValue + "'");
                            // TODO 暂时仅对简单Input支持，需要进一步实现
                            var name = (0, _jquery2['default'])(this).find("input").attr("name");

                            data[name] = newValue;
                        }
                    });
                }

                return data;
            },

            /**
             * 提取表单数据为具有复杂数据结构的对象<br/>
             * 输入控件的 name 值可以含有具体的路径，如：user.firstname、user.contactList[0].name<br/>
             * @method extractAsObjects
             * @static
             * @for eb.utils.form
             * @param {String} formId [必选] 表单ID
             * @param {boolean} filtEmpty [可选] [默认：false] 是否过滤空字段
             * @param {String} valueSep [可选] [默认：eb.settings.MUTI_VAL_SEP] 同名字段分隔符
             * @return {Object} 以复杂对象形式表示的表单值<br/>
             * <pre>
             * {'user': {'firstname': 'Hello',
             *           'lastname': 'World',
             *            'contactList': [{'name': 'xxx', 'tel': 'xxxxxx'},
             *                            {'name': 'xxx', 'tel': 'xxxxxx'}]},
             *  'prod': {'id': 'PRD0001',
             *           'name': 'Super Cool Stuff'}}
             * </pre>
             */
            extractAsObjects: function extractAsObjects(formId, filtEmpty, valueSep) {
                filtEmpty = filtEmpty || false;
                valueSep = valueSep || eb.settings.MUTI_VAL_SEP;

                var formData = eb.utils.form.extractAsSerializedArray(formId, filtEmpty);

                var data = {};

                for (var i = 0; i < formData.length; i++) {
                    var namePathArr = formData[i].name.split(".");
                    var namePath = "data";

                    // 通过过滤器计算最终字段取值
                    var currentVal = formData[i].value.trim();
                    currentVal = currentVal.replace(/\"/g, "\\\"");

                    for (var j = 0; j < namePathArr.length; j++) {
                        var isArray;
                        // 生成当前路径
                        // 1. 数组
                        if (namePathArr[j].match(/\[\d\]$/)) {
                            isArray = true;
                            var arrIndex = parseInt(namePathArr[j].substr(namePathArr[j].lastIndexOf("[") + 1, namePathArr[j].lastIndexOf("]") - namePathArr[j].lastIndexOf("[") - 1));
                            namePath += "." + namePathArr[j];
                            var nameArrPath = namePath.substr(0, namePath.lastIndexOf("["));

                            if (typeof eval(nameArrPath) == "undefined") eval(nameArrPath + "=[];");

                            while (eval(nameArrPath + ".length") <= arrIndex) {
                                eval(nameArrPath + ".push({})");
                            }

                            if (j == namePathArr.length - 1) eval(nameArrPath + "[" + arrIndex + "]=\"" + currentVal + "\";");
                            // 2. 对象
                        } else {
                            isArray = false;
                            namePath += "." + namePathArr[j];

                            if (j < namePathArr.length - 1) {
                                if (typeof eval(namePath) == "undefined") eval(namePath + "={};");
                            } else {
                                if (typeof eval(namePath) == "undefined") {
                                    eval(namePath + "=\"" + currentVal + "\"");
                                } else {
                                    eval(namePath + "+=\"" + valueSep + currentVal + "\"");
                                }
                            }
                        }
                    }
                }

                return data;
            }
        }
    },

    EventProxy: _EventProxy2['default'],

    Client: _Client2['default'],

    tplengine: _artTemplate2['default'],

    component: __webpack_require__(22)
};

module.exports = framework;

/***/ }),
/* 2 */
/***/ (function(module, exports) {

// Console-polyfill. MIT license.
// https://github.com/paulmillr/console-polyfill
// Make it safe to do console.log() always.
(function(global) {
  'use strict';
  if (!global.console) {
    global.console = {};
  }
  var con = global.console;
  var prop, method;
  var dummy = function() {};
  var properties = ['memory'];
  var methods = ('assert,clear,count,debug,dir,dirxml,error,exception,group,' +
     'groupCollapsed,groupEnd,info,log,markTimeline,profile,profiles,profileEnd,' +
     'show,table,time,timeEnd,timeline,timelineEnd,timeStamp,trace,warn').split(',');
  while (prop = properties.pop()) if (!con[prop]) con[prop] = {};
  while (method = methods.pop()) if (typeof con[method] !== 'function') con[method] = dummy;
  // Using `this` for web workers & supports Browserify / Webpack.
})(typeof window === 'undefined' ? this : window);


/***/ }),
/* 3 */
/***/ (function(module, exports, __webpack_require__) {

var __WEBPACK_AMD_DEFINE_FACTORY__, __WEBPACK_AMD_DEFINE_RESULT__;/*!
 * https://github.com/es-shims/es5-shim
 * @license es5-shim Copyright 2009-2015 by contributors, MIT License
 * see https://github.com/es-shims/es5-shim/blob/master/LICENSE
 */

// vim: ts=4 sts=4 sw=4 expandtab

// Add semicolon to prevent IIFE from being passed as argument to concatenated code.
;

// UMD (Universal Module Definition)
// see https://github.com/umdjs/umd/blob/master/templates/returnExports.js
(function (root, factory) {
    'use strict';

    /* global define, exports, module */
    if (true) {
        // AMD. Register as an anonymous module.
        !(__WEBPACK_AMD_DEFINE_FACTORY__ = (factory),
				__WEBPACK_AMD_DEFINE_RESULT__ = (typeof __WEBPACK_AMD_DEFINE_FACTORY__ === 'function' ?
				(__WEBPACK_AMD_DEFINE_FACTORY__.call(exports, __webpack_require__, exports, module)) :
				__WEBPACK_AMD_DEFINE_FACTORY__),
				__WEBPACK_AMD_DEFINE_RESULT__ !== undefined && (module.exports = __WEBPACK_AMD_DEFINE_RESULT__));
    } else if (typeof exports === 'object') {
        // Node. Does not work with strict CommonJS, but
        // only CommonJS-like enviroments that support module.exports,
        // like Node.
        module.exports = factory();
    } else {
        // Browser globals (root is window)
        root.returnExports = factory();
    }
}(this, function () {

    var call = Function.call;
    var prototypeOfObject = Object.prototype;
    var owns = call.bind(prototypeOfObject.hasOwnProperty);
    var isEnumerable = call.bind(prototypeOfObject.propertyIsEnumerable);
    var toStr = call.bind(prototypeOfObject.toString);

    // If JS engine supports accessors creating shortcuts.
    var defineGetter;
    var defineSetter;
    var lookupGetter;
    var lookupSetter;
    var supportsAccessors = owns(prototypeOfObject, '__defineGetter__');
    if (supportsAccessors) {
        /* eslint-disable no-underscore-dangle */
        defineGetter = call.bind(prototypeOfObject.__defineGetter__);
        defineSetter = call.bind(prototypeOfObject.__defineSetter__);
        lookupGetter = call.bind(prototypeOfObject.__lookupGetter__);
        lookupSetter = call.bind(prototypeOfObject.__lookupSetter__);
        /* eslint-enable no-underscore-dangle */
    }

    var isPrimitive = function isPrimitive(o) {
        return o == null || (typeof o !== 'object' && typeof o !== 'function');
    };

    // ES5 15.2.3.2
    // http://es5.github.com/#x15.2.3.2
    if (!Object.getPrototypeOf) {
        // https://github.com/es-shims/es5-shim/issues#issue/2
        // http://ejohn.org/blog/objectgetprototypeof/
        // recommended by fschaefer on github
        //
        // sure, and webreflection says ^_^
        // ... this will nerever possibly return null
        // ... Opera Mini breaks here with infinite loops
        Object.getPrototypeOf = function getPrototypeOf(object) {
            /* eslint-disable no-proto */
            var proto = object.__proto__;
            /* eslint-enable no-proto */
            if (proto || proto === null) {
                return proto;
            } else if (toStr(object.constructor) === '[object Function]') {
                return object.constructor.prototype;
            } else if (object instanceof Object) {
                return prototypeOfObject;
            } else {
                // Correctly return null for Objects created with `Object.create(null)`
                // (shammed or native) or `{ __proto__: null}`.  Also returns null for
                // cross-realm objects on browsers that lack `__proto__` support (like
                // IE <11), but that's the best we can do.
                return null;
            }
        };
    }

    // ES5 15.2.3.3
    // http://es5.github.com/#x15.2.3.3

    var doesGetOwnPropertyDescriptorWork = function doesGetOwnPropertyDescriptorWork(object) {
        try {
            object.sentinel = 0;
            return Object.getOwnPropertyDescriptor(object, 'sentinel').value === 0;
        } catch (exception) {
            return false;
        }
    };

    // check whether getOwnPropertyDescriptor works if it's given. Otherwise, shim partially.
    if (Object.defineProperty) {
        var getOwnPropertyDescriptorWorksOnObject = doesGetOwnPropertyDescriptorWork({});
        var getOwnPropertyDescriptorWorksOnDom = typeof document === 'undefined' ||
        doesGetOwnPropertyDescriptorWork(document.createElement('div'));
        if (!getOwnPropertyDescriptorWorksOnDom || !getOwnPropertyDescriptorWorksOnObject) {
            var getOwnPropertyDescriptorFallback = Object.getOwnPropertyDescriptor;
        }
    }

    if (!Object.getOwnPropertyDescriptor || getOwnPropertyDescriptorFallback) {
        var ERR_NON_OBJECT = 'Object.getOwnPropertyDescriptor called on a non-object: ';

        /* eslint-disable no-proto */
        Object.getOwnPropertyDescriptor = function getOwnPropertyDescriptor(object, property) {
            if (isPrimitive(object)) {
                throw new TypeError(ERR_NON_OBJECT + object);
            }

            // make a valiant attempt to use the real getOwnPropertyDescriptor
            // for I8's DOM elements.
            if (getOwnPropertyDescriptorFallback) {
                try {
                    return getOwnPropertyDescriptorFallback.call(Object, object, property);
                } catch (exception) {
                    // try the shim if the real one doesn't work
                }
            }

            var descriptor;

            // If object does not owns property return undefined immediately.
            if (!owns(object, property)) {
                return descriptor;
            }

            // If object has a property then it's for sure `configurable`, and
            // probably `enumerable`. Detect enumerability though.
            descriptor = {
                enumerable: isEnumerable(object, property),
                configurable: true
            };

            // If JS engine supports accessor properties then property may be a
            // getter or setter.
            if (supportsAccessors) {
                // Unfortunately `__lookupGetter__` will return a getter even
                // if object has own non getter property along with a same named
                // inherited getter. To avoid misbehavior we temporary remove
                // `__proto__` so that `__lookupGetter__` will return getter only
                // if it's owned by an object.
                var prototype = object.__proto__;
                var notPrototypeOfObject = object !== prototypeOfObject;
                // avoid recursion problem, breaking in Opera Mini when
                // Object.getOwnPropertyDescriptor(Object.prototype, 'toString')
                // or any other Object.prototype accessor
                if (notPrototypeOfObject) {
                    object.__proto__ = prototypeOfObject;
                }

                var getter = lookupGetter(object, property);
                var setter = lookupSetter(object, property);

                if (notPrototypeOfObject) {
                    // Once we have getter and setter we can put values back.
                    object.__proto__ = prototype;
                }

                if (getter || setter) {
                    if (getter) {
                        descriptor.get = getter;
                    }
                    if (setter) {
                        descriptor.set = setter;
                    }
                    // If it was accessor property we're done and return here
                    // in order to avoid adding `value` to the descriptor.
                    return descriptor;
                }
            }

            // If we got this far we know that object has an own property that is
            // not an accessor so we set it as a value and return descriptor.
            descriptor.value = object[property];
            descriptor.writable = true;
            return descriptor;
        };
        /* eslint-enable no-proto */
    }

    // ES5 15.2.3.4
    // http://es5.github.com/#x15.2.3.4
    if (!Object.getOwnPropertyNames) {
        Object.getOwnPropertyNames = function getOwnPropertyNames(object) {
            return Object.keys(object);
        };
    }

    // ES5 15.2.3.5
    // http://es5.github.com/#x15.2.3.5
    if (!Object.create) {

        // Contributed by Brandon Benvie, October, 2012
        var createEmpty;
        var supportsProto = !({ __proto__: null } instanceof Object);
                            // the following produces false positives
                            // in Opera Mini => not a reliable check
                            // Object.prototype.__proto__ === null

        // Check for document.domain and active x support
        // No need to use active x approach when document.domain is not set
        // see https://github.com/es-shims/es5-shim/issues/150
        // variation of https://github.com/kitcambridge/es5-shim/commit/4f738ac066346
        /* global ActiveXObject */
        var shouldUseActiveX = function shouldUseActiveX() {
            // return early if document.domain not set
            if (!document.domain) {
                return false;
            }

            try {
                return !!new ActiveXObject('htmlfile');
            } catch (exception) {
                return false;
            }
        };

        // This supports IE8 when document.domain is used
        // see https://github.com/es-shims/es5-shim/issues/150
        // variation of https://github.com/kitcambridge/es5-shim/commit/4f738ac066346
        var getEmptyViaActiveX = function getEmptyViaActiveX() {
            var empty;
            var xDoc;

            xDoc = new ActiveXObject('htmlfile');

            var script = 'script';
            xDoc.write('<' + script + '></' + script + '>');
            xDoc.close();

            empty = xDoc.parentWindow.Object.prototype;
            xDoc = null;

            return empty;
        };

        // The original implementation using an iframe
        // before the activex approach was added
        // see https://github.com/es-shims/es5-shim/issues/150
        var getEmptyViaIFrame = function getEmptyViaIFrame() {
            var iframe = document.createElement('iframe');
            var parent = document.body || document.documentElement;
            var empty;

            iframe.style.display = 'none';
            parent.appendChild(iframe);
            /* eslint-disable no-script-url */
            iframe.src = 'javascript:';
            /* eslint-enable no-script-url */

            empty = iframe.contentWindow.Object.prototype;
            parent.removeChild(iframe);
            iframe = null;

            return empty;
        };

        /* global document */
        if (supportsProto || typeof document === 'undefined') {
            createEmpty = function () {
                return { __proto__: null };
            };
        } else {
            // In old IE __proto__ can't be used to manually set `null`, nor does
            // any other method exist to make an object that inherits from nothing,
            // aside from Object.prototype itself. Instead, create a new global
            // object and *steal* its Object.prototype and strip it bare. This is
            // used as the prototype to create nullary objects.
            createEmpty = function () {
                // Determine which approach to use
                // see https://github.com/es-shims/es5-shim/issues/150
                var empty = shouldUseActiveX() ? getEmptyViaActiveX() : getEmptyViaIFrame();

                delete empty.constructor;
                delete empty.hasOwnProperty;
                delete empty.propertyIsEnumerable;
                delete empty.isPrototypeOf;
                delete empty.toLocaleString;
                delete empty.toString;
                delete empty.valueOf;

                var Empty = function Empty() {};
                Empty.prototype = empty;
                // short-circuit future calls
                createEmpty = function () {
                    return new Empty();
                };
                return new Empty();
            };
        }

        Object.create = function create(prototype, properties) {

            var object;
            var Type = function Type() {}; // An empty constructor.

            if (prototype === null) {
                object = createEmpty();
            } else {
                if (prototype !== null && isPrimitive(prototype)) {
                    // In the native implementation `parent` can be `null`
                    // OR *any* `instanceof Object`  (Object|Function|Array|RegExp|etc)
                    // Use `typeof` tho, b/c in old IE, DOM elements are not `instanceof Object`
                    // like they are in modern browsers. Using `Object.create` on DOM elements
                    // is...err...probably inappropriate, but the native version allows for it.
                    throw new TypeError('Object prototype may only be an Object or null'); // same msg as Chrome
                }
                Type.prototype = prototype;
                object = new Type();
                // IE has no built-in implementation of `Object.getPrototypeOf`
                // neither `__proto__`, but this manually setting `__proto__` will
                // guarantee that `Object.getPrototypeOf` will work as expected with
                // objects created using `Object.create`
                /* eslint-disable no-proto */
                object.__proto__ = prototype;
                /* eslint-enable no-proto */
            }

            if (properties !== void 0) {
                Object.defineProperties(object, properties);
            }

            return object;
        };
    }

    // ES5 15.2.3.6
    // http://es5.github.com/#x15.2.3.6

    // Patch for WebKit and IE8 standard mode
    // Designed by hax <hax.github.com>
    // related issue: https://github.com/es-shims/es5-shim/issues#issue/5
    // IE8 Reference:
    //     http://msdn.microsoft.com/en-us/library/dd282900.aspx
    //     http://msdn.microsoft.com/en-us/library/dd229916.aspx
    // WebKit Bugs:
    //     https://bugs.webkit.org/show_bug.cgi?id=36423

    var doesDefinePropertyWork = function doesDefinePropertyWork(object) {
        try {
            Object.defineProperty(object, 'sentinel', {});
            return 'sentinel' in object;
        } catch (exception) {
            return false;
        }
    };

    // check whether defineProperty works if it's given. Otherwise,
    // shim partially.
    if (Object.defineProperty) {
        var definePropertyWorksOnObject = doesDefinePropertyWork({});
        var definePropertyWorksOnDom = typeof document === 'undefined' ||
            doesDefinePropertyWork(document.createElement('div'));
        if (!definePropertyWorksOnObject || !definePropertyWorksOnDom) {
            var definePropertyFallback = Object.defineProperty,
                definePropertiesFallback = Object.defineProperties;
        }
    }

    if (!Object.defineProperty || definePropertyFallback) {
        var ERR_NON_OBJECT_DESCRIPTOR = 'Property description must be an object: ';
        var ERR_NON_OBJECT_TARGET = 'Object.defineProperty called on non-object: ';
        var ERR_ACCESSORS_NOT_SUPPORTED = 'getters & setters can not be defined on this javascript engine';

        Object.defineProperty = function defineProperty(object, property, descriptor) {
            if (isPrimitive(object)) {
                throw new TypeError(ERR_NON_OBJECT_TARGET + object);
            }
            if (isPrimitive(descriptor)) {
                throw new TypeError(ERR_NON_OBJECT_DESCRIPTOR + descriptor);
            }
            // make a valiant attempt to use the real defineProperty
            // for I8's DOM elements.
            if (definePropertyFallback) {
                try {
                    return definePropertyFallback.call(Object, object, property, descriptor);
                } catch (exception) {
                    // try the shim if the real one doesn't work
                }
            }

            // If it's a data property.
            if ('value' in descriptor) {
                // fail silently if 'writable', 'enumerable', or 'configurable'
                // are requested but not supported
                /*
                // alternate approach:
                if ( // can't implement these features; allow false but not true
                    ('writable' in descriptor && !descriptor.writable) ||
                    ('enumerable' in descriptor && !descriptor.enumerable) ||
                    ('configurable' in descriptor && !descriptor.configurable)
                ))
                    throw new RangeError(
                        'This implementation of Object.defineProperty does not support configurable, enumerable, or writable.'
                    );
                */

                if (supportsAccessors && (lookupGetter(object, property) || lookupSetter(object, property))) {
                    // As accessors are supported only on engines implementing
                    // `__proto__` we can safely override `__proto__` while defining
                    // a property to make sure that we don't hit an inherited
                    // accessor.
                    /* eslint-disable no-proto */
                    var prototype = object.__proto__;
                    object.__proto__ = prototypeOfObject;
                    // Deleting a property anyway since getter / setter may be
                    // defined on object itself.
                    delete object[property];
                    object[property] = descriptor.value;
                    // Setting original `__proto__` back now.
                    object.__proto__ = prototype;
                    /* eslint-enable no-proto */
                } else {
                    object[property] = descriptor.value;
                }
            } else {
                var hasGetter = 'get' in descriptor;
                var hasSetter = 'set' in descriptor;
                if (!supportsAccessors && (hasGetter || hasSetter)) {
                    throw new TypeError(ERR_ACCESSORS_NOT_SUPPORTED);
                }
                // If we got that far then getters and setters can be defined !!
                if (hasGetter) {
                    defineGetter(object, property, descriptor.get);
                }
                if (hasSetter) {
                    defineSetter(object, property, descriptor.set);
                }
            }
            return object;
        };
    }

    // ES5 15.2.3.7
    // http://es5.github.com/#x15.2.3.7
    if (!Object.defineProperties || definePropertiesFallback) {
        Object.defineProperties = function defineProperties(object, properties) {
            // make a valiant attempt to use the real defineProperties
            if (definePropertiesFallback) {
                try {
                    return definePropertiesFallback.call(Object, object, properties);
                } catch (exception) {
                    // try the shim if the real one doesn't work
                }
            }

            Object.keys(properties).forEach(function (property) {
                if (property !== '__proto__') {
                    Object.defineProperty(object, property, properties[property]);
                }
            });
            return object;
        };
    }

    // ES5 15.2.3.8
    // http://es5.github.com/#x15.2.3.8
    if (!Object.seal) {
        Object.seal = function seal(object) {
            if (Object(object) !== object) {
                throw new TypeError('Object.seal can only be called on Objects.');
            }
            // this is misleading and breaks feature-detection, but
            // allows "securable" code to "gracefully" degrade to working
            // but insecure code.
            return object;
        };
    }

    // ES5 15.2.3.9
    // http://es5.github.com/#x15.2.3.9
    if (!Object.freeze) {
        Object.freeze = function freeze(object) {
            if (Object(object) !== object) {
                throw new TypeError('Object.freeze can only be called on Objects.');
            }
            // this is misleading and breaks feature-detection, but
            // allows "securable" code to "gracefully" degrade to working
            // but insecure code.
            return object;
        };
    }

    // detect a Rhino bug and patch it
    try {
        Object.freeze(function () {});
    } catch (exception) {
        Object.freeze = (function (freezeObject) {
            return function freeze(object) {
                if (typeof object === 'function') {
                    return object;
                } else {
                    return freezeObject(object);
                }
            };
        }(Object.freeze));
    }

    // ES5 15.2.3.10
    // http://es5.github.com/#x15.2.3.10
    if (!Object.preventExtensions) {
        Object.preventExtensions = function preventExtensions(object) {
            if (Object(object) !== object) {
                throw new TypeError('Object.preventExtensions can only be called on Objects.');
            }
            // this is misleading and breaks feature-detection, but
            // allows "securable" code to "gracefully" degrade to working
            // but insecure code.
            return object;
        };
    }

    // ES5 15.2.3.11
    // http://es5.github.com/#x15.2.3.11
    if (!Object.isSealed) {
        Object.isSealed = function isSealed(object) {
            if (Object(object) !== object) {
                throw new TypeError('Object.isSealed can only be called on Objects.');
            }
            return false;
        };
    }

    // ES5 15.2.3.12
    // http://es5.github.com/#x15.2.3.12
    if (!Object.isFrozen) {
        Object.isFrozen = function isFrozen(object) {
            if (Object(object) !== object) {
                throw new TypeError('Object.isFrozen can only be called on Objects.');
            }
            return false;
        };
    }

    // ES5 15.2.3.13
    // http://es5.github.com/#x15.2.3.13
    if (!Object.isExtensible) {
        Object.isExtensible = function isExtensible(object) {
            // 1. If Type(O) is not Object throw a TypeError exception.
            if (Object(object) !== object) {
                throw new TypeError('Object.isExtensible can only be called on Objects.');
            }
            // 2. Return the Boolean value of the [[Extensible]] internal property of O.
            var name = '';
            while (owns(object, name)) {
                name += '?';
            }
            object[name] = true;
            var returnValue = owns(object, name);
            delete object[name];
            return returnValue;
        };
    }

}));


/***/ }),
/* 4 */
/***/ (function(module, exports, __webpack_require__) {

var __WEBPACK_AMD_DEFINE_FACTORY__, __WEBPACK_AMD_DEFINE_RESULT__;/*!
 * https://github.com/es-shims/es5-shim
 * @license es5-shim Copyright 2009-2015 by contributors, MIT License
 * see https://github.com/es-shims/es5-shim/blob/master/LICENSE
 */

// vim: ts=4 sts=4 sw=4 expandtab

// Add semicolon to prevent IIFE from being passed as argument to concatenated code.
;

// UMD (Universal Module Definition)
// see https://github.com/umdjs/umd/blob/master/templates/returnExports.js
(function (root, factory) {
    'use strict';

    /* global define, exports, module */
    if (true) {
        // AMD. Register as an anonymous module.
        !(__WEBPACK_AMD_DEFINE_FACTORY__ = (factory),
				__WEBPACK_AMD_DEFINE_RESULT__ = (typeof __WEBPACK_AMD_DEFINE_FACTORY__ === 'function' ?
				(__WEBPACK_AMD_DEFINE_FACTORY__.call(exports, __webpack_require__, exports, module)) :
				__WEBPACK_AMD_DEFINE_FACTORY__),
				__WEBPACK_AMD_DEFINE_RESULT__ !== undefined && (module.exports = __WEBPACK_AMD_DEFINE_RESULT__));
    } else if (typeof exports === 'object') {
        // Node. Does not work with strict CommonJS, but
        // only CommonJS-like enviroments that support module.exports,
        // like Node.
        module.exports = factory();
    } else {
        // Browser globals (root is window)
        root.returnExports = factory();
    }
}(this, function () {
    /**
     * Brings an environment as close to ECMAScript 5 compliance
     * as is possible with the facilities of erstwhile engines.
     *
     * Annotated ES5: http://es5.github.com/ (specific links below)
     * ES5 Spec: http://www.ecma-international.org/publications/files/ECMA-ST/Ecma-262.pdf
     * Required reading: http://javascriptweblog.wordpress.com/2011/12/05/extending-javascript-natives/
     */

    // Shortcut to an often accessed properties, in order to avoid multiple
    // dereference that costs universally. This also holds a reference to known-good
    // functions.
    var $Array = Array;
    var ArrayPrototype = $Array.prototype;
    var $Object = Object;
    var ObjectPrototype = $Object.prototype;
    var $Function = Function;
    var FunctionPrototype = $Function.prototype;
    var $String = String;
    var StringPrototype = $String.prototype;
    var $Number = Number;
    var NumberPrototype = $Number.prototype;
    var array_slice = ArrayPrototype.slice;
    var array_splice = ArrayPrototype.splice;
    var array_push = ArrayPrototype.push;
    var array_unshift = ArrayPrototype.unshift;
    var array_concat = ArrayPrototype.concat;
    var array_join = ArrayPrototype.join;
    var call = FunctionPrototype.call;
    var apply = FunctionPrototype.apply;
    var max = Math.max;
    var min = Math.min;

    // Having a toString local variable name breaks in Opera so use to_string.
    var to_string = ObjectPrototype.toString;

    /* global Symbol */
    /* eslint-disable one-var-declaration-per-line, no-redeclare, max-statements-per-line */
    var hasToStringTag = typeof Symbol === 'function' && typeof Symbol.toStringTag === 'symbol';
    var isCallable; /* inlined from https://npmjs.com/is-callable */ var fnToStr = Function.prototype.toString, constructorRegex = /^\s*class /, isES6ClassFn = function isES6ClassFn(value) { try { var fnStr = fnToStr.call(value); var singleStripped = fnStr.replace(/\/\/.*\n/g, ''); var multiStripped = singleStripped.replace(/\/\*[.\s\S]*\*\//g, ''); var spaceStripped = multiStripped.replace(/\n/mg, ' ').replace(/ {2}/g, ' '); return constructorRegex.test(spaceStripped); } catch (e) { return false; /* not a function */ } }, tryFunctionObject = function tryFunctionObject(value) { try { if (isES6ClassFn(value)) { return false; } fnToStr.call(value); return true; } catch (e) { return false; } }, fnClass = '[object Function]', genClass = '[object GeneratorFunction]', isCallable = function isCallable(value) { if (!value) { return false; } if (typeof value !== 'function' && typeof value !== 'object') { return false; } if (hasToStringTag) { return tryFunctionObject(value); } if (isES6ClassFn(value)) { return false; } var strClass = to_string.call(value); return strClass === fnClass || strClass === genClass; };

    var isRegex; /* inlined from https://npmjs.com/is-regex */ var regexExec = RegExp.prototype.exec, tryRegexExec = function tryRegexExec(value) { try { regexExec.call(value); return true; } catch (e) { return false; } }, regexClass = '[object RegExp]'; isRegex = function isRegex(value) { if (typeof value !== 'object') { return false; } return hasToStringTag ? tryRegexExec(value) : to_string.call(value) === regexClass; };
    var isString; /* inlined from https://npmjs.com/is-string */ var strValue = String.prototype.valueOf, tryStringObject = function tryStringObject(value) { try { strValue.call(value); return true; } catch (e) { return false; } }, stringClass = '[object String]'; isString = function isString(value) { if (typeof value === 'string') { return true; } if (typeof value !== 'object') { return false; } return hasToStringTag ? tryStringObject(value) : to_string.call(value) === stringClass; };
    /* eslint-enable one-var-declaration-per-line, no-redeclare, max-statements-per-line */

    /* inlined from http://npmjs.com/define-properties */
    var supportsDescriptors = $Object.defineProperty && (function () {
        try {
            var obj = {};
            $Object.defineProperty(obj, 'x', { enumerable: false, value: obj });
            for (var _ in obj) { // jscs:ignore disallowUnusedVariables
                return false;
            }
            return obj.x === obj;
        } catch (e) { /* this is ES3 */
            return false;
        }
    }());
    var defineProperties = (function (has) {
        // Define configurable, writable, and non-enumerable props
        // if they don't exist.
        var defineProperty;
        if (supportsDescriptors) {
            defineProperty = function (object, name, method, forceAssign) {
                if (!forceAssign && (name in object)) {
                    return;
                }
                $Object.defineProperty(object, name, {
                    configurable: true,
                    enumerable: false,
                    writable: true,
                    value: method
                });
            };
        } else {
            defineProperty = function (object, name, method, forceAssign) {
                if (!forceAssign && (name in object)) {
                    return;
                }
                object[name] = method;
            };
        }
        return function defineProperties(object, map, forceAssign) {
            for (var name in map) {
                if (has.call(map, name)) {
                    defineProperty(object, name, map[name], forceAssign);
                }
            }
        };
    }(ObjectPrototype.hasOwnProperty));

    //
    // Util
    // ======
    //

    /* replaceable with https://npmjs.com/package/es-abstract /helpers/isPrimitive */
    var isPrimitive = function isPrimitive(input) {
        var type = typeof input;
        return input === null || (type !== 'object' && type !== 'function');
    };

    var isActualNaN = $Number.isNaN || function isActualNaN(x) {
        return x !== x;
    };

    var ES = {
        // ES5 9.4
        // http://es5.github.com/#x9.4
        // http://jsperf.com/to-integer
        /* replaceable with https://npmjs.com/package/es-abstract ES5.ToInteger */
        ToInteger: function ToInteger(num) {
            var n = +num;
            if (isActualNaN(n)) {
                n = 0;
            } else if (n !== 0 && n !== (1 / 0) && n !== -(1 / 0)) {
                n = (n > 0 || -1) * Math.floor(Math.abs(n));
            }
            return n;
        },

        /* replaceable with https://npmjs.com/package/es-abstract ES5.ToPrimitive */
        ToPrimitive: function ToPrimitive(input) {
            var val, valueOf, toStr;
            if (isPrimitive(input)) {
                return input;
            }
            valueOf = input.valueOf;
            if (isCallable(valueOf)) {
                val = valueOf.call(input);
                if (isPrimitive(val)) {
                    return val;
                }
            }
            toStr = input.toString;
            if (isCallable(toStr)) {
                val = toStr.call(input);
                if (isPrimitive(val)) {
                    return val;
                }
            }
            throw new TypeError();
        },

        // ES5 9.9
        // http://es5.github.com/#x9.9
        /* replaceable with https://npmjs.com/package/es-abstract ES5.ToObject */
        ToObject: function (o) {
            if (o == null) { // this matches both null and undefined
                throw new TypeError("can't convert " + o + ' to object');
            }
            return $Object(o);
        },

        /* replaceable with https://npmjs.com/package/es-abstract ES5.ToUint32 */
        ToUint32: function ToUint32(x) {
            return x >>> 0;
        }
    };

    //
    // Function
    // ========
    //

    // ES-5 15.3.4.5
    // http://es5.github.com/#x15.3.4.5

    var Empty = function Empty() {};

    defineProperties(FunctionPrototype, {
        bind: function bind(that) { // .length is 1
            // 1. Let Target be the this value.
            var target = this;
            // 2. If IsCallable(Target) is false, throw a TypeError exception.
            if (!isCallable(target)) {
                throw new TypeError('Function.prototype.bind called on incompatible ' + target);
            }
            // 3. Let A be a new (possibly empty) internal list of all of the
            //   argument values provided after thisArg (arg1, arg2 etc), in order.
            // XXX slicedArgs will stand in for "A" if used
            var args = array_slice.call(arguments, 1); // for normal call
            // 4. Let F be a new native ECMAScript object.
            // 11. Set the [[Prototype]] internal property of F to the standard
            //   built-in Function prototype object as specified in 15.3.3.1.
            // 12. Set the [[Call]] internal property of F as described in
            //   15.3.4.5.1.
            // 13. Set the [[Construct]] internal property of F as described in
            //   15.3.4.5.2.
            // 14. Set the [[HasInstance]] internal property of F as described in
            //   15.3.4.5.3.
            var bound;
            var binder = function () {

                if (this instanceof bound) {
                    // 15.3.4.5.2 [[Construct]]
                    // When the [[Construct]] internal method of a function object,
                    // F that was created using the bind function is called with a
                    // list of arguments ExtraArgs, the following steps are taken:
                    // 1. Let target be the value of F's [[TargetFunction]]
                    //   internal property.
                    // 2. If target has no [[Construct]] internal method, a
                    //   TypeError exception is thrown.
                    // 3. Let boundArgs be the value of F's [[BoundArgs]] internal
                    //   property.
                    // 4. Let args be a new list containing the same values as the
                    //   list boundArgs in the same order followed by the same
                    //   values as the list ExtraArgs in the same order.
                    // 5. Return the result of calling the [[Construct]] internal
                    //   method of target providing args as the arguments.

                    var result = apply.call(
                        target,
                        this,
                        array_concat.call(args, array_slice.call(arguments))
                    );
                    if ($Object(result) === result) {
                        return result;
                    }
                    return this;

                } else {
                    // 15.3.4.5.1 [[Call]]
                    // When the [[Call]] internal method of a function object, F,
                    // which was created using the bind function is called with a
                    // this value and a list of arguments ExtraArgs, the following
                    // steps are taken:
                    // 1. Let boundArgs be the value of F's [[BoundArgs]] internal
                    //   property.
                    // 2. Let boundThis be the value of F's [[BoundThis]] internal
                    //   property.
                    // 3. Let target be the value of F's [[TargetFunction]] internal
                    //   property.
                    // 4. Let args be a new list containing the same values as the
                    //   list boundArgs in the same order followed by the same
                    //   values as the list ExtraArgs in the same order.
                    // 5. Return the result of calling the [[Call]] internal method
                    //   of target providing boundThis as the this value and
                    //   providing args as the arguments.

                    // equiv: target.call(this, ...boundArgs, ...args)
                    return apply.call(
                        target,
                        that,
                        array_concat.call(args, array_slice.call(arguments))
                    );

                }

            };

            // 15. If the [[Class]] internal property of Target is "Function", then
            //     a. Let L be the length property of Target minus the length of A.
            //     b. Set the length own property of F to either 0 or L, whichever is
            //       larger.
            // 16. Else set the length own property of F to 0.

            var boundLength = max(0, target.length - args.length);

            // 17. Set the attributes of the length own property of F to the values
            //   specified in 15.3.5.1.
            var boundArgs = [];
            for (var i = 0; i < boundLength; i++) {
                array_push.call(boundArgs, '$' + i);
            }

            // XXX Build a dynamic function with desired amount of arguments is the only
            // way to set the length property of a function.
            // In environments where Content Security Policies enabled (Chrome extensions,
            // for ex.) all use of eval or Function costructor throws an exception.
            // However in all of these environments Function.prototype.bind exists
            // and so this code will never be executed.
            bound = $Function('binder', 'return function (' + array_join.call(boundArgs, ',') + '){ return binder.apply(this, arguments); }')(binder);

            if (target.prototype) {
                Empty.prototype = target.prototype;
                bound.prototype = new Empty();
                // Clean up dangling references.
                Empty.prototype = null;
            }

            // TODO
            // 18. Set the [[Extensible]] internal property of F to true.

            // TODO
            // 19. Let thrower be the [[ThrowTypeError]] function Object (13.2.3).
            // 20. Call the [[DefineOwnProperty]] internal method of F with
            //   arguments "caller", PropertyDescriptor {[[Get]]: thrower, [[Set]]:
            //   thrower, [[Enumerable]]: false, [[Configurable]]: false}, and
            //   false.
            // 21. Call the [[DefineOwnProperty]] internal method of F with
            //   arguments "arguments", PropertyDescriptor {[[Get]]: thrower,
            //   [[Set]]: thrower, [[Enumerable]]: false, [[Configurable]]: false},
            //   and false.

            // TODO
            // NOTE Function objects created using Function.prototype.bind do not
            // have a prototype property or the [[Code]], [[FormalParameters]], and
            // [[Scope]] internal properties.
            // XXX can't delete prototype in pure-js.

            // 22. Return F.
            return bound;
        }
    });

    // _Please note: Shortcuts are defined after `Function.prototype.bind` as we
    // use it in defining shortcuts.
    var owns = call.bind(ObjectPrototype.hasOwnProperty);
    var toStr = call.bind(ObjectPrototype.toString);
    var arraySlice = call.bind(array_slice);
    var arraySliceApply = apply.bind(array_slice);
    var strSlice = call.bind(StringPrototype.slice);
    var strSplit = call.bind(StringPrototype.split);
    var strIndexOf = call.bind(StringPrototype.indexOf);
    var pushCall = call.bind(array_push);
    var isEnum = call.bind(ObjectPrototype.propertyIsEnumerable);
    var arraySort = call.bind(ArrayPrototype.sort);

    //
    // Array
    // =====
    //

    var isArray = $Array.isArray || function isArray(obj) {
        return toStr(obj) === '[object Array]';
    };

    // ES5 15.4.4.12
    // http://es5.github.com/#x15.4.4.13
    // Return len+argCount.
    // [bugfix, ielt8]
    // IE < 8 bug: [].unshift(0) === undefined but should be "1"
    var hasUnshiftReturnValueBug = [].unshift(0) !== 1;
    defineProperties(ArrayPrototype, {
        unshift: function () {
            array_unshift.apply(this, arguments);
            return this.length;
        }
    }, hasUnshiftReturnValueBug);

    // ES5 15.4.3.2
    // http://es5.github.com/#x15.4.3.2
    // https://developer.mozilla.org/en/JavaScript/Reference/Global_Objects/Array/isArray
    defineProperties($Array, { isArray: isArray });

    // The IsCallable() check in the Array functions
    // has been replaced with a strict check on the
    // internal class of the object to trap cases where
    // the provided function was actually a regular
    // expression literal, which in V8 and
    // JavaScriptCore is a typeof "function".  Only in
    // V8 are regular expression literals permitted as
    // reduce parameters, so it is desirable in the
    // general case for the shim to match the more
    // strict and common behavior of rejecting regular
    // expressions.

    // ES5 15.4.4.18
    // http://es5.github.com/#x15.4.4.18
    // https://developer.mozilla.org/en/JavaScript/Reference/Global_Objects/array/forEach

    // Check failure of by-index access of string characters (IE < 9)
    // and failure of `0 in boxedString` (Rhino)
    var boxedString = $Object('a');
    var splitString = boxedString[0] !== 'a' || !(0 in boxedString);

    var properlyBoxesContext = function properlyBoxed(method) {
        // Check node 0.6.21 bug where third parameter is not boxed
        var properlyBoxesNonStrict = true;
        var properlyBoxesStrict = true;
        var threwException = false;
        if (method) {
            try {
                method.call('foo', function (_, __, context) {
                    if (typeof context !== 'object') {
                        properlyBoxesNonStrict = false;
                    }
                });

                method.call([1], function () {
                    'use strict';

                    properlyBoxesStrict = typeof this === 'string';
                }, 'x');
            } catch (e) {
                threwException = true;
            }
        }
        return !!method && !threwException && properlyBoxesNonStrict && properlyBoxesStrict;
    };

    defineProperties(ArrayPrototype, {
        forEach: function forEach(callbackfn/*, thisArg*/) {
            var object = ES.ToObject(this);
            var self = splitString && isString(this) ? strSplit(this, '') : object;
            var i = -1;
            var length = ES.ToUint32(self.length);
            var T;
            if (arguments.length > 1) {
                T = arguments[1];
            }

            // If no callback function or if callback is not a callable function
            if (!isCallable(callbackfn)) {
                throw new TypeError('Array.prototype.forEach callback must be a function');
            }

            while (++i < length) {
                if (i in self) {
                    // Invoke the callback function with call, passing arguments:
                    // context, property value, property key, thisArg object
                    if (typeof T === 'undefined') {
                        callbackfn(self[i], i, object);
                    } else {
                        callbackfn.call(T, self[i], i, object);
                    }
                }
            }
        }
    }, !properlyBoxesContext(ArrayPrototype.forEach));

    // ES5 15.4.4.19
    // http://es5.github.com/#x15.4.4.19
    // https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/map
    defineProperties(ArrayPrototype, {
        map: function map(callbackfn/*, thisArg*/) {
            var object = ES.ToObject(this);
            var self = splitString && isString(this) ? strSplit(this, '') : object;
            var length = ES.ToUint32(self.length);
            var result = $Array(length);
            var T;
            if (arguments.length > 1) {
                T = arguments[1];
            }

            // If no callback function or if callback is not a callable function
            if (!isCallable(callbackfn)) {
                throw new TypeError('Array.prototype.map callback must be a function');
            }

            for (var i = 0; i < length; i++) {
                if (i in self) {
                    if (typeof T === 'undefined') {
                        result[i] = callbackfn(self[i], i, object);
                    } else {
                        result[i] = callbackfn.call(T, self[i], i, object);
                    }
                }
            }
            return result;
        }
    }, !properlyBoxesContext(ArrayPrototype.map));

    // ES5 15.4.4.20
    // http://es5.github.com/#x15.4.4.20
    // https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/filter
    defineProperties(ArrayPrototype, {
        filter: function filter(callbackfn/*, thisArg*/) {
            var object = ES.ToObject(this);
            var self = splitString && isString(this) ? strSplit(this, '') : object;
            var length = ES.ToUint32(self.length);
            var result = [];
            var value;
            var T;
            if (arguments.length > 1) {
                T = arguments[1];
            }

            // If no callback function or if callback is not a callable function
            if (!isCallable(callbackfn)) {
                throw new TypeError('Array.prototype.filter callback must be a function');
            }

            for (var i = 0; i < length; i++) {
                if (i in self) {
                    value = self[i];
                    if (typeof T === 'undefined' ? callbackfn(value, i, object) : callbackfn.call(T, value, i, object)) {
                        pushCall(result, value);
                    }
                }
            }
            return result;
        }
    }, !properlyBoxesContext(ArrayPrototype.filter));

    // ES5 15.4.4.16
    // http://es5.github.com/#x15.4.4.16
    // https://developer.mozilla.org/en/JavaScript/Reference/Global_Objects/Array/every
    defineProperties(ArrayPrototype, {
        every: function every(callbackfn/*, thisArg*/) {
            var object = ES.ToObject(this);
            var self = splitString && isString(this) ? strSplit(this, '') : object;
            var length = ES.ToUint32(self.length);
            var T;
            if (arguments.length > 1) {
                T = arguments[1];
            }

            // If no callback function or if callback is not a callable function
            if (!isCallable(callbackfn)) {
                throw new TypeError('Array.prototype.every callback must be a function');
            }

            for (var i = 0; i < length; i++) {
                if (i in self && !(typeof T === 'undefined' ? callbackfn(self[i], i, object) : callbackfn.call(T, self[i], i, object))) {
                    return false;
                }
            }
            return true;
        }
    }, !properlyBoxesContext(ArrayPrototype.every));

    // ES5 15.4.4.17
    // http://es5.github.com/#x15.4.4.17
    // https://developer.mozilla.org/en/JavaScript/Reference/Global_Objects/Array/some
    defineProperties(ArrayPrototype, {
        some: function some(callbackfn/*, thisArg */) {
            var object = ES.ToObject(this);
            var self = splitString && isString(this) ? strSplit(this, '') : object;
            var length = ES.ToUint32(self.length);
            var T;
            if (arguments.length > 1) {
                T = arguments[1];
            }

            // If no callback function or if callback is not a callable function
            if (!isCallable(callbackfn)) {
                throw new TypeError('Array.prototype.some callback must be a function');
            }

            for (var i = 0; i < length; i++) {
                if (i in self && (typeof T === 'undefined' ? callbackfn(self[i], i, object) : callbackfn.call(T, self[i], i, object))) {
                    return true;
                }
            }
            return false;
        }
    }, !properlyBoxesContext(ArrayPrototype.some));

    // ES5 15.4.4.21
    // http://es5.github.com/#x15.4.4.21
    // https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/reduce
    var reduceCoercesToObject = false;
    if (ArrayPrototype.reduce) {
        reduceCoercesToObject = typeof ArrayPrototype.reduce.call('es5', function (_, __, ___, list) {
            return list;
        }) === 'object';
    }
    defineProperties(ArrayPrototype, {
        reduce: function reduce(callbackfn/*, initialValue*/) {
            var object = ES.ToObject(this);
            var self = splitString && isString(this) ? strSplit(this, '') : object;
            var length = ES.ToUint32(self.length);

            // If no callback function or if callback is not a callable function
            if (!isCallable(callbackfn)) {
                throw new TypeError('Array.prototype.reduce callback must be a function');
            }

            // no value to return if no initial value and an empty array
            if (length === 0 && arguments.length === 1) {
                throw new TypeError('reduce of empty array with no initial value');
            }

            var i = 0;
            var result;
            if (arguments.length >= 2) {
                result = arguments[1];
            } else {
                do {
                    if (i in self) {
                        result = self[i++];
                        break;
                    }

                    // if array contains no values, no initial value to return
                    if (++i >= length) {
                        throw new TypeError('reduce of empty array with no initial value');
                    }
                } while (true);
            }

            for (; i < length; i++) {
                if (i in self) {
                    result = callbackfn(result, self[i], i, object);
                }
            }

            return result;
        }
    }, !reduceCoercesToObject);

    // ES5 15.4.4.22
    // http://es5.github.com/#x15.4.4.22
    // https://developer.mozilla.org/en/Core_JavaScript_1.5_Reference/Objects/Array/reduceRight
    var reduceRightCoercesToObject = false;
    if (ArrayPrototype.reduceRight) {
        reduceRightCoercesToObject = typeof ArrayPrototype.reduceRight.call('es5', function (_, __, ___, list) {
            return list;
        }) === 'object';
    }
    defineProperties(ArrayPrototype, {
        reduceRight: function reduceRight(callbackfn/*, initial*/) {
            var object = ES.ToObject(this);
            var self = splitString && isString(this) ? strSplit(this, '') : object;
            var length = ES.ToUint32(self.length);

            // If no callback function or if callback is not a callable function
            if (!isCallable(callbackfn)) {
                throw new TypeError('Array.prototype.reduceRight callback must be a function');
            }

            // no value to return if no initial value, empty array
            if (length === 0 && arguments.length === 1) {
                throw new TypeError('reduceRight of empty array with no initial value');
            }

            var result;
            var i = length - 1;
            if (arguments.length >= 2) {
                result = arguments[1];
            } else {
                do {
                    if (i in self) {
                        result = self[i--];
                        break;
                    }

                    // if array contains no values, no initial value to return
                    if (--i < 0) {
                        throw new TypeError('reduceRight of empty array with no initial value');
                    }
                } while (true);
            }

            if (i < 0) {
                return result;
            }

            do {
                if (i in self) {
                    result = callbackfn(result, self[i], i, object);
                }
            } while (i--);

            return result;
        }
    }, !reduceRightCoercesToObject);

    // ES5 15.4.4.14
    // http://es5.github.com/#x15.4.4.14
    // https://developer.mozilla.org/en/JavaScript/Reference/Global_Objects/Array/indexOf
    var hasFirefox2IndexOfBug = ArrayPrototype.indexOf && [0, 1].indexOf(1, 2) !== -1;
    defineProperties(ArrayPrototype, {
        indexOf: function indexOf(searchElement/*, fromIndex */) {
            var self = splitString && isString(this) ? strSplit(this, '') : ES.ToObject(this);
            var length = ES.ToUint32(self.length);

            if (length === 0) {
                return -1;
            }

            var i = 0;
            if (arguments.length > 1) {
                i = ES.ToInteger(arguments[1]);
            }

            // handle negative indices
            i = i >= 0 ? i : max(0, length + i);
            for (; i < length; i++) {
                if (i in self && self[i] === searchElement) {
                    return i;
                }
            }
            return -1;
        }
    }, hasFirefox2IndexOfBug);

    // ES5 15.4.4.15
    // http://es5.github.com/#x15.4.4.15
    // https://developer.mozilla.org/en/JavaScript/Reference/Global_Objects/Array/lastIndexOf
    var hasFirefox2LastIndexOfBug = ArrayPrototype.lastIndexOf && [0, 1].lastIndexOf(0, -3) !== -1;
    defineProperties(ArrayPrototype, {
        lastIndexOf: function lastIndexOf(searchElement/*, fromIndex */) {
            var self = splitString && isString(this) ? strSplit(this, '') : ES.ToObject(this);
            var length = ES.ToUint32(self.length);

            if (length === 0) {
                return -1;
            }
            var i = length - 1;
            if (arguments.length > 1) {
                i = min(i, ES.ToInteger(arguments[1]));
            }
            // handle negative indices
            i = i >= 0 ? i : length - Math.abs(i);
            for (; i >= 0; i--) {
                if (i in self && searchElement === self[i]) {
                    return i;
                }
            }
            return -1;
        }
    }, hasFirefox2LastIndexOfBug);

    // ES5 15.4.4.12
    // http://es5.github.com/#x15.4.4.12
    var spliceNoopReturnsEmptyArray = (function () {
        var a = [1, 2];
        var result = a.splice();
        return a.length === 2 && isArray(result) && result.length === 0;
    }());
    defineProperties(ArrayPrototype, {
        // Safari 5.0 bug where .splice() returns undefined
        splice: function splice(start, deleteCount) {
            if (arguments.length === 0) {
                return [];
            } else {
                return array_splice.apply(this, arguments);
            }
        }
    }, !spliceNoopReturnsEmptyArray);

    var spliceWorksWithEmptyObject = (function () {
        var obj = {};
        ArrayPrototype.splice.call(obj, 0, 0, 1);
        return obj.length === 1;
    }());
    defineProperties(ArrayPrototype, {
        splice: function splice(start, deleteCount) {
            if (arguments.length === 0) {
                return [];
            }
            var args = arguments;
            this.length = max(ES.ToInteger(this.length), 0);
            if (arguments.length > 0 && typeof deleteCount !== 'number') {
                args = arraySlice(arguments);
                if (args.length < 2) {
                    pushCall(args, this.length - start);
                } else {
                    args[1] = ES.ToInteger(deleteCount);
                }
            }
            return array_splice.apply(this, args);
        }
    }, !spliceWorksWithEmptyObject);
    var spliceWorksWithLargeSparseArrays = (function () {
        // Per https://github.com/es-shims/es5-shim/issues/295
        // Safari 7/8 breaks with sparse arrays of size 1e5 or greater
        var arr = new $Array(1e5);
        // note: the index MUST be 8 or larger or the test will false pass
        arr[8] = 'x';
        arr.splice(1, 1);
        // note: this test must be defined *after* the indexOf shim
        // per https://github.com/es-shims/es5-shim/issues/313
        return arr.indexOf('x') === 7;
    }());
    var spliceWorksWithSmallSparseArrays = (function () {
        // Per https://github.com/es-shims/es5-shim/issues/295
        // Opera 12.15 breaks on this, no idea why.
        var n = 256;
        var arr = [];
        arr[n] = 'a';
        arr.splice(n + 1, 0, 'b');
        return arr[n] === 'a';
    }());
    defineProperties(ArrayPrototype, {
        splice: function splice(start, deleteCount) {
            var O = ES.ToObject(this);
            var A = [];
            var len = ES.ToUint32(O.length);
            var relativeStart = ES.ToInteger(start);
            var actualStart = relativeStart < 0 ? max((len + relativeStart), 0) : min(relativeStart, len);
            var actualDeleteCount = min(max(ES.ToInteger(deleteCount), 0), len - actualStart);

            var k = 0;
            var from;
            while (k < actualDeleteCount) {
                from = $String(actualStart + k);
                if (owns(O, from)) {
                    A[k] = O[from];
                }
                k += 1;
            }

            var items = arraySlice(arguments, 2);
            var itemCount = items.length;
            var to;
            if (itemCount < actualDeleteCount) {
                k = actualStart;
                var maxK = len - actualDeleteCount;
                while (k < maxK) {
                    from = $String(k + actualDeleteCount);
                    to = $String(k + itemCount);
                    if (owns(O, from)) {
                        O[to] = O[from];
                    } else {
                        delete O[to];
                    }
                    k += 1;
                }
                k = len;
                var minK = len - actualDeleteCount + itemCount;
                while (k > minK) {
                    delete O[k - 1];
                    k -= 1;
                }
            } else if (itemCount > actualDeleteCount) {
                k = len - actualDeleteCount;
                while (k > actualStart) {
                    from = $String(k + actualDeleteCount - 1);
                    to = $String(k + itemCount - 1);
                    if (owns(O, from)) {
                        O[to] = O[from];
                    } else {
                        delete O[to];
                    }
                    k -= 1;
                }
            }
            k = actualStart;
            for (var i = 0; i < items.length; ++i) {
                O[k] = items[i];
                k += 1;
            }
            O.length = len - actualDeleteCount + itemCount;

            return A;
        }
    }, !spliceWorksWithLargeSparseArrays || !spliceWorksWithSmallSparseArrays);

    var originalJoin = ArrayPrototype.join;
    var hasStringJoinBug;
    try {
        hasStringJoinBug = Array.prototype.join.call('123', ',') !== '1,2,3';
    } catch (e) {
        hasStringJoinBug = true;
    }
    if (hasStringJoinBug) {
        defineProperties(ArrayPrototype, {
            join: function join(separator) {
                var sep = typeof separator === 'undefined' ? ',' : separator;
                return originalJoin.call(isString(this) ? strSplit(this, '') : this, sep);
            }
        }, hasStringJoinBug);
    }

    var hasJoinUndefinedBug = [1, 2].join(undefined) !== '1,2';
    if (hasJoinUndefinedBug) {
        defineProperties(ArrayPrototype, {
            join: function join(separator) {
                var sep = typeof separator === 'undefined' ? ',' : separator;
                return originalJoin.call(this, sep);
            }
        }, hasJoinUndefinedBug);
    }

    var pushShim = function push(item) {
        var O = ES.ToObject(this);
        var n = ES.ToUint32(O.length);
        var i = 0;
        while (i < arguments.length) {
            O[n + i] = arguments[i];
            i += 1;
        }
        O.length = n + i;
        return n + i;
    };

    var pushIsNotGeneric = (function () {
        var obj = {};
        var result = Array.prototype.push.call(obj, undefined);
        return result !== 1 || obj.length !== 1 || typeof obj[0] !== 'undefined' || !owns(obj, 0);
    }());
    defineProperties(ArrayPrototype, {
        push: function push(item) {
            if (isArray(this)) {
                return array_push.apply(this, arguments);
            }
            return pushShim.apply(this, arguments);
        }
    }, pushIsNotGeneric);

    // This fixes a very weird bug in Opera 10.6 when pushing `undefined
    var pushUndefinedIsWeird = (function () {
        var arr = [];
        var result = arr.push(undefined);
        return result !== 1 || arr.length !== 1 || typeof arr[0] !== 'undefined' || !owns(arr, 0);
    }());
    defineProperties(ArrayPrototype, { push: pushShim }, pushUndefinedIsWeird);

    // ES5 15.2.3.14
    // http://es5.github.io/#x15.4.4.10
    // Fix boxed string bug
    defineProperties(ArrayPrototype, {
        slice: function (start, end) {
            var arr = isString(this) ? strSplit(this, '') : this;
            return arraySliceApply(arr, arguments);
        }
    }, splitString);

    var sortIgnoresNonFunctions = (function () {
        try {
            [1, 2].sort(null);
            [1, 2].sort({});
            return true;
        } catch (e) {}
        return false;
    }());
    var sortThrowsOnRegex = (function () {
        // this is a problem in Firefox 4, in which `typeof /a/ === 'function'`
        try {
            [1, 2].sort(/a/);
            return false;
        } catch (e) {}
        return true;
    }());
    var sortIgnoresUndefined = (function () {
        // applies in IE 8, for one.
        try {
            [1, 2].sort(undefined);
            return true;
        } catch (e) {}
        return false;
    }());
    defineProperties(ArrayPrototype, {
        sort: function sort(compareFn) {
            if (typeof compareFn === 'undefined') {
                return arraySort(this);
            }
            if (!isCallable(compareFn)) {
                throw new TypeError('Array.prototype.sort callback must be a function');
            }
            return arraySort(this, compareFn);
        }
    }, sortIgnoresNonFunctions || !sortIgnoresUndefined || !sortThrowsOnRegex);

    //
    // Object
    // ======
    //

    // ES5 15.2.3.14
    // http://es5.github.com/#x15.2.3.14

    // http://whattheheadsaid.com/2010/10/a-safer-object-keys-compatibility-implementation
    var hasDontEnumBug = !isEnum({ 'toString': null }, 'toString');
    var hasProtoEnumBug = isEnum(function () {}, 'prototype');
    var hasStringEnumBug = !owns('x', '0');
    var equalsConstructorPrototype = function (o) {
        var ctor = o.constructor;
        return ctor && ctor.prototype === o;
    };
    var blacklistedKeys = {
        $window: true,
        $console: true,
        $parent: true,
        $self: true,
        $frame: true,
        $frames: true,
        $frameElement: true,
        $webkitIndexedDB: true,
        $webkitStorageInfo: true,
        $external: true
    };
    var hasAutomationEqualityBug = (function () {
        /* globals window */
        if (typeof window === 'undefined') {
            return false;
        }
        for (var k in window) {
            try {
                if (!blacklistedKeys['$' + k] && owns(window, k) && window[k] !== null && typeof window[k] === 'object') {
                    equalsConstructorPrototype(window[k]);
                }
            } catch (e) {
                return true;
            }
        }
        return false;
    }());
    var equalsConstructorPrototypeIfNotBuggy = function (object) {
        if (typeof window === 'undefined' || !hasAutomationEqualityBug) {
            return equalsConstructorPrototype(object);
        }
        try {
            return equalsConstructorPrototype(object);
        } catch (e) {
            return false;
        }
    };
    var dontEnums = [
        'toString',
        'toLocaleString',
        'valueOf',
        'hasOwnProperty',
        'isPrototypeOf',
        'propertyIsEnumerable',
        'constructor'
    ];
    var dontEnumsLength = dontEnums.length;

    // taken directly from https://github.com/ljharb/is-arguments/blob/master/index.js
    // can be replaced with require('is-arguments') if we ever use a build process instead
    var isStandardArguments = function isArguments(value) {
        return toStr(value) === '[object Arguments]';
    };
    var isLegacyArguments = function isArguments(value) {
        return value !== null &&
            typeof value === 'object' &&
            typeof value.length === 'number' &&
            value.length >= 0 &&
            !isArray(value) &&
            isCallable(value.callee);
    };
    var isArguments = isStandardArguments(arguments) ? isStandardArguments : isLegacyArguments;

    defineProperties($Object, {
        keys: function keys(object) {
            var isFn = isCallable(object);
            var isArgs = isArguments(object);
            var isObject = object !== null && typeof object === 'object';
            var isStr = isObject && isString(object);

            if (!isObject && !isFn && !isArgs) {
                throw new TypeError('Object.keys called on a non-object');
            }

            var theKeys = [];
            var skipProto = hasProtoEnumBug && isFn;
            if ((isStr && hasStringEnumBug) || isArgs) {
                for (var i = 0; i < object.length; ++i) {
                    pushCall(theKeys, $String(i));
                }
            }

            if (!isArgs) {
                for (var name in object) {
                    if (!(skipProto && name === 'prototype') && owns(object, name)) {
                        pushCall(theKeys, $String(name));
                    }
                }
            }

            if (hasDontEnumBug) {
                var skipConstructor = equalsConstructorPrototypeIfNotBuggy(object);
                for (var j = 0; j < dontEnumsLength; j++) {
                    var dontEnum = dontEnums[j];
                    if (!(skipConstructor && dontEnum === 'constructor') && owns(object, dontEnum)) {
                        pushCall(theKeys, dontEnum);
                    }
                }
            }
            return theKeys;
        }
    });

    var keysWorksWithArguments = $Object.keys && (function () {
        // Safari 5.0 bug
        return $Object.keys(arguments).length === 2;
    }(1, 2));
    var keysHasArgumentsLengthBug = $Object.keys && (function () {
        var argKeys = $Object.keys(arguments);
        return arguments.length !== 1 || argKeys.length !== 1 || argKeys[0] !== 1;
    }(1));
    var originalKeys = $Object.keys;
    defineProperties($Object, {
        keys: function keys(object) {
            if (isArguments(object)) {
                return originalKeys(arraySlice(object));
            } else {
                return originalKeys(object);
            }
        }
    }, !keysWorksWithArguments || keysHasArgumentsLengthBug);

    //
    // Date
    // ====
    //

    var hasNegativeMonthYearBug = new Date(-3509827329600292).getUTCMonth() !== 0;
    var aNegativeTestDate = new Date(-1509842289600292);
    var aPositiveTestDate = new Date(1449662400000);
    var hasToUTCStringFormatBug = aNegativeTestDate.toUTCString() !== 'Mon, 01 Jan -45875 11:59:59 GMT';
    var hasToDateStringFormatBug;
    var hasToStringFormatBug;
    var timeZoneOffset = aNegativeTestDate.getTimezoneOffset();
    if (timeZoneOffset < -720) {
        hasToDateStringFormatBug = aNegativeTestDate.toDateString() !== 'Tue Jan 02 -45875';
        hasToStringFormatBug = !(/^Thu Dec 10 2015 \d\d:\d\d:\d\d GMT[-\+]\d\d\d\d(?: |$)/).test(aPositiveTestDate.toString());
    } else {
        hasToDateStringFormatBug = aNegativeTestDate.toDateString() !== 'Mon Jan 01 -45875';
        hasToStringFormatBug = !(/^Wed Dec 09 2015 \d\d:\d\d:\d\d GMT[-\+]\d\d\d\d(?: |$)/).test(aPositiveTestDate.toString());
    }

    var originalGetFullYear = call.bind(Date.prototype.getFullYear);
    var originalGetMonth = call.bind(Date.prototype.getMonth);
    var originalGetDate = call.bind(Date.prototype.getDate);
    var originalGetUTCFullYear = call.bind(Date.prototype.getUTCFullYear);
    var originalGetUTCMonth = call.bind(Date.prototype.getUTCMonth);
    var originalGetUTCDate = call.bind(Date.prototype.getUTCDate);
    var originalGetUTCDay = call.bind(Date.prototype.getUTCDay);
    var originalGetUTCHours = call.bind(Date.prototype.getUTCHours);
    var originalGetUTCMinutes = call.bind(Date.prototype.getUTCMinutes);
    var originalGetUTCSeconds = call.bind(Date.prototype.getUTCSeconds);
    var originalGetUTCMilliseconds = call.bind(Date.prototype.getUTCMilliseconds);
    var dayName = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];
    var monthName = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'];
    var daysInMonth = function daysInMonth(month, year) {
        return originalGetDate(new Date(year, month, 0));
    };

    defineProperties(Date.prototype, {
        getFullYear: function getFullYear() {
            if (!this || !(this instanceof Date)) {
                throw new TypeError('this is not a Date object.');
            }
            var year = originalGetFullYear(this);
            if (year < 0 && originalGetMonth(this) > 11) {
                return year + 1;
            }
            return year;
        },
        getMonth: function getMonth() {
            if (!this || !(this instanceof Date)) {
                throw new TypeError('this is not a Date object.');
            }
            var year = originalGetFullYear(this);
            var month = originalGetMonth(this);
            if (year < 0 && month > 11) {
                return 0;
            }
            return month;
        },
        getDate: function getDate() {
            if (!this || !(this instanceof Date)) {
                throw new TypeError('this is not a Date object.');
            }
            var year = originalGetFullYear(this);
            var month = originalGetMonth(this);
            var date = originalGetDate(this);
            if (year < 0 && month > 11) {
                if (month === 12) {
                    return date;
                }
                var days = daysInMonth(0, year + 1);
                return (days - date) + 1;
            }
            return date;
        },
        getUTCFullYear: function getUTCFullYear() {
            if (!this || !(this instanceof Date)) {
                throw new TypeError('this is not a Date object.');
            }
            var year = originalGetUTCFullYear(this);
            if (year < 0 && originalGetUTCMonth(this) > 11) {
                return year + 1;
            }
            return year;
        },
        getUTCMonth: function getUTCMonth() {
            if (!this || !(this instanceof Date)) {
                throw new TypeError('this is not a Date object.');
            }
            var year = originalGetUTCFullYear(this);
            var month = originalGetUTCMonth(this);
            if (year < 0 && month > 11) {
                return 0;
            }
            return month;
        },
        getUTCDate: function getUTCDate() {
            if (!this || !(this instanceof Date)) {
                throw new TypeError('this is not a Date object.');
            }
            var year = originalGetUTCFullYear(this);
            var month = originalGetUTCMonth(this);
            var date = originalGetUTCDate(this);
            if (year < 0 && month > 11) {
                if (month === 12) {
                    return date;
                }
                var days = daysInMonth(0, year + 1);
                return (days - date) + 1;
            }
            return date;
        }
    }, hasNegativeMonthYearBug);

    defineProperties(Date.prototype, {
        toUTCString: function toUTCString() {
            if (!this || !(this instanceof Date)) {
                throw new TypeError('this is not a Date object.');
            }
            var day = originalGetUTCDay(this);
            var date = originalGetUTCDate(this);
            var month = originalGetUTCMonth(this);
            var year = originalGetUTCFullYear(this);
            var hour = originalGetUTCHours(this);
            var minute = originalGetUTCMinutes(this);
            var second = originalGetUTCSeconds(this);
            return dayName[day] + ', ' +
                (date < 10 ? '0' + date : date) + ' ' +
                monthName[month] + ' ' +
                year + ' ' +
                (hour < 10 ? '0' + hour : hour) + ':' +
                (minute < 10 ? '0' + minute : minute) + ':' +
                (second < 10 ? '0' + second : second) + ' GMT';
        }
    }, hasNegativeMonthYearBug || hasToUTCStringFormatBug);

    // Opera 12 has `,`
    defineProperties(Date.prototype, {
        toDateString: function toDateString() {
            if (!this || !(this instanceof Date)) {
                throw new TypeError('this is not a Date object.');
            }
            var day = this.getDay();
            var date = this.getDate();
            var month = this.getMonth();
            var year = this.getFullYear();
            return dayName[day] + ' ' +
                monthName[month] + ' ' +
                (date < 10 ? '0' + date : date) + ' ' +
                year;
        }
    }, hasNegativeMonthYearBug || hasToDateStringFormatBug);

    // can't use defineProperties here because of toString enumeration issue in IE <= 8
    if (hasNegativeMonthYearBug || hasToStringFormatBug) {
        Date.prototype.toString = function toString() {
            if (!this || !(this instanceof Date)) {
                throw new TypeError('this is not a Date object.');
            }
            var day = this.getDay();
            var date = this.getDate();
            var month = this.getMonth();
            var year = this.getFullYear();
            var hour = this.getHours();
            var minute = this.getMinutes();
            var second = this.getSeconds();
            var timezoneOffset = this.getTimezoneOffset();
            var hoursOffset = Math.floor(Math.abs(timezoneOffset) / 60);
            var minutesOffset = Math.floor(Math.abs(timezoneOffset) % 60);
            return dayName[day] + ' ' +
                monthName[month] + ' ' +
                (date < 10 ? '0' + date : date) + ' ' +
                year + ' ' +
                (hour < 10 ? '0' + hour : hour) + ':' +
                (minute < 10 ? '0' + minute : minute) + ':' +
                (second < 10 ? '0' + second : second) + ' GMT' +
                (timezoneOffset > 0 ? '-' : '+') +
                (hoursOffset < 10 ? '0' + hoursOffset : hoursOffset) +
                (minutesOffset < 10 ? '0' + minutesOffset : minutesOffset);
        };
        if (supportsDescriptors) {
            $Object.defineProperty(Date.prototype, 'toString', {
                configurable: true,
                enumerable: false,
                writable: true
            });
        }
    }

    // ES5 15.9.5.43
    // http://es5.github.com/#x15.9.5.43
    // This function returns a String value represent the instance in time
    // represented by this Date object. The format of the String is the Date Time
    // string format defined in 15.9.1.15. All fields are present in the String.
    // The time zone is always UTC, denoted by the suffix Z. If the time value of
    // this object is not a finite Number a RangeError exception is thrown.
    var negativeDate = -62198755200000;
    var negativeYearString = '-000001';
    var hasNegativeDateBug = Date.prototype.toISOString && new Date(negativeDate).toISOString().indexOf(negativeYearString) === -1;
    var hasSafari51DateBug = Date.prototype.toISOString && new Date(-1).toISOString() !== '1969-12-31T23:59:59.999Z';

    var getTime = call.bind(Date.prototype.getTime);

    defineProperties(Date.prototype, {
        toISOString: function toISOString() {
            if (!isFinite(this) || !isFinite(getTime(this))) {
                // Adope Photoshop requires the second check.
                throw new RangeError('Date.prototype.toISOString called on non-finite value.');
            }

            var year = originalGetUTCFullYear(this);

            var month = originalGetUTCMonth(this);
            // see https://github.com/es-shims/es5-shim/issues/111
            year += Math.floor(month / 12);
            month = (month % 12 + 12) % 12;

            // the date time string format is specified in 15.9.1.15.
            var result = [month + 1, originalGetUTCDate(this), originalGetUTCHours(this), originalGetUTCMinutes(this), originalGetUTCSeconds(this)];
            year = (
                (year < 0 ? '-' : (year > 9999 ? '+' : '')) +
                strSlice('00000' + Math.abs(year), (0 <= year && year <= 9999) ? -4 : -6)
            );

            for (var i = 0; i < result.length; ++i) {
                // pad months, days, hours, minutes, and seconds to have two digits.
                result[i] = strSlice('00' + result[i], -2);
            }
            // pad milliseconds to have three digits.
            return (
                year + '-' + arraySlice(result, 0, 2).join('-') +
                'T' + arraySlice(result, 2).join(':') + '.' +
                strSlice('000' + originalGetUTCMilliseconds(this), -3) + 'Z'
            );
        }
    }, hasNegativeDateBug || hasSafari51DateBug);

    // ES5 15.9.5.44
    // http://es5.github.com/#x15.9.5.44
    // This function provides a String representation of a Date object for use by
    // JSON.stringify (15.12.3).
    var dateToJSONIsSupported = (function () {
        try {
            return Date.prototype.toJSON &&
                new Date(NaN).toJSON() === null &&
                new Date(negativeDate).toJSON().indexOf(negativeYearString) !== -1 &&
                Date.prototype.toJSON.call({ // generic
                    toISOString: function () { return true; }
                });
        } catch (e) {
            return false;
        }
    }());
    if (!dateToJSONIsSupported) {
        Date.prototype.toJSON = function toJSON(key) {
            // When the toJSON method is called with argument key, the following
            // steps are taken:

            // 1.  Let O be the result of calling ToObject, giving it the this
            // value as its argument.
            // 2. Let tv be ES.ToPrimitive(O, hint Number).
            var O = $Object(this);
            var tv = ES.ToPrimitive(O);
            // 3. If tv is a Number and is not finite, return null.
            if (typeof tv === 'number' && !isFinite(tv)) {
                return null;
            }
            // 4. Let toISO be the result of calling the [[Get]] internal method of
            // O with argument "toISOString".
            var toISO = O.toISOString;
            // 5. If IsCallable(toISO) is false, throw a TypeError exception.
            if (!isCallable(toISO)) {
                throw new TypeError('toISOString property is not callable');
            }
            // 6. Return the result of calling the [[Call]] internal method of
            //  toISO with O as the this value and an empty argument list.
            return toISO.call(O);

            // NOTE 1 The argument is ignored.

            // NOTE 2 The toJSON function is intentionally generic; it does not
            // require that its this value be a Date object. Therefore, it can be
            // transferred to other kinds of objects for use as a method. However,
            // it does require that any such object have a toISOString method. An
            // object is free to use the argument key to filter its
            // stringification.
        };
    }

    // ES5 15.9.4.2
    // http://es5.github.com/#x15.9.4.2
    // based on work shared by Daniel Friesen (dantman)
    // http://gist.github.com/303249
    var supportsExtendedYears = Date.parse('+033658-09-27T01:46:40.000Z') === 1e15;
    var acceptsInvalidDates = !isNaN(Date.parse('2012-04-04T24:00:00.500Z')) || !isNaN(Date.parse('2012-11-31T23:59:59.000Z')) || !isNaN(Date.parse('2012-12-31T23:59:60.000Z'));
    var doesNotParseY2KNewYear = isNaN(Date.parse('2000-01-01T00:00:00.000Z'));
    if (doesNotParseY2KNewYear || acceptsInvalidDates || !supportsExtendedYears) {
        // XXX global assignment won't work in embeddings that use
        // an alternate object for the context.
        /* global Date: true */
        /* eslint-disable no-undef */
        var maxSafeUnsigned32Bit = Math.pow(2, 31) - 1;
        var hasSafariSignedIntBug = isActualNaN(new Date(1970, 0, 1, 0, 0, 0, maxSafeUnsigned32Bit + 1).getTime());
        /* eslint-disable no-implicit-globals */
        Date = (function (NativeDate) {
        /* eslint-enable no-implicit-globals */
        /* eslint-enable no-undef */
            // Date.length === 7
            var DateShim = function Date(Y, M, D, h, m, s, ms) {
                var length = arguments.length;
                var date;
                if (this instanceof NativeDate) {
                    var seconds = s;
                    var millis = ms;
                    if (hasSafariSignedIntBug && length >= 7 && ms > maxSafeUnsigned32Bit) {
                        // work around a Safari 8/9 bug where it treats the seconds as signed
                        var msToShift = Math.floor(ms / maxSafeUnsigned32Bit) * maxSafeUnsigned32Bit;
                        var sToShift = Math.floor(msToShift / 1e3);
                        seconds += sToShift;
                        millis -= sToShift * 1e3;
                    }
                    date = length === 1 && $String(Y) === Y ? // isString(Y)
                        // We explicitly pass it through parse:
                        new NativeDate(DateShim.parse(Y)) :
                        // We have to manually make calls depending on argument
                        // length here
                        length >= 7 ? new NativeDate(Y, M, D, h, m, seconds, millis) :
                        length >= 6 ? new NativeDate(Y, M, D, h, m, seconds) :
                        length >= 5 ? new NativeDate(Y, M, D, h, m) :
                        length >= 4 ? new NativeDate(Y, M, D, h) :
                        length >= 3 ? new NativeDate(Y, M, D) :
                        length >= 2 ? new NativeDate(Y, M) :
                        length >= 1 ? new NativeDate(Y instanceof NativeDate ? +Y : Y) :
                                      new NativeDate();
                } else {
                    date = NativeDate.apply(this, arguments);
                }
                if (!isPrimitive(date)) {
                    // Prevent mixups with unfixed Date object
                    defineProperties(date, { constructor: DateShim }, true);
                }
                return date;
            };

            // 15.9.1.15 Date Time String Format.
            var isoDateExpression = new RegExp('^' +
                '(\\d{4}|[+-]\\d{6})' + // four-digit year capture or sign +
                                          // 6-digit extended year
                '(?:-(\\d{2})' + // optional month capture
                '(?:-(\\d{2})' + // optional day capture
                '(?:' + // capture hours:minutes:seconds.milliseconds
                    'T(\\d{2})' + // hours capture
                    ':(\\d{2})' + // minutes capture
                    '(?:' + // optional :seconds.milliseconds
                        ':(\\d{2})' + // seconds capture
                        '(?:(\\.\\d{1,}))?' + // milliseconds capture
                    ')?' +
                '(' + // capture UTC offset component
                    'Z|' + // UTC capture
                    '(?:' + // offset specifier +/-hours:minutes
                        '([-+])' + // sign capture
                        '(\\d{2})' + // hours offset capture
                        ':(\\d{2})' + // minutes offset capture
                    ')' +
                ')?)?)?)?' +
            '$');

            var months = [0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365];

            var dayFromMonth = function dayFromMonth(year, month) {
                var t = month > 1 ? 1 : 0;
                return (
                    months[month] +
                    Math.floor((year - 1969 + t) / 4) -
                    Math.floor((year - 1901 + t) / 100) +
                    Math.floor((year - 1601 + t) / 400) +
                    365 * (year - 1970)
                );
            };

            var toUTC = function toUTC(t) {
                var s = 0;
                var ms = t;
                if (hasSafariSignedIntBug && ms > maxSafeUnsigned32Bit) {
                    // work around a Safari 8/9 bug where it treats the seconds as signed
                    var msToShift = Math.floor(ms / maxSafeUnsigned32Bit) * maxSafeUnsigned32Bit;
                    var sToShift = Math.floor(msToShift / 1e3);
                    s += sToShift;
                    ms -= sToShift * 1e3;
                }
                return $Number(new NativeDate(1970, 0, 1, 0, 0, s, ms));
            };

            // Copy any custom methods a 3rd party library may have added
            for (var key in NativeDate) {
                if (owns(NativeDate, key)) {
                    DateShim[key] = NativeDate[key];
                }
            }

            // Copy "native" methods explicitly; they may be non-enumerable
            defineProperties(DateShim, {
                now: NativeDate.now,
                UTC: NativeDate.UTC
            }, true);
            DateShim.prototype = NativeDate.prototype;
            defineProperties(DateShim.prototype, {
                constructor: DateShim
            }, true);

            // Upgrade Date.parse to handle simplified ISO 8601 strings
            var parseShim = function parse(string) {
                var match = isoDateExpression.exec(string);
                if (match) {
                    // parse months, days, hours, minutes, seconds, and milliseconds
                    // provide default values if necessary
                    // parse the UTC offset component
                    var year = $Number(match[1]),
                        month = $Number(match[2] || 1) - 1,
                        day = $Number(match[3] || 1) - 1,
                        hour = $Number(match[4] || 0),
                        minute = $Number(match[5] || 0),
                        second = $Number(match[6] || 0),
                        millisecond = Math.floor($Number(match[7] || 0) * 1000),
                        // When time zone is missed, local offset should be used
                        // (ES 5.1 bug)
                        // see https://bugs.ecmascript.org/show_bug.cgi?id=112
                        isLocalTime = Boolean(match[4] && !match[8]),
                        signOffset = match[9] === '-' ? 1 : -1,
                        hourOffset = $Number(match[10] || 0),
                        minuteOffset = $Number(match[11] || 0),
                        result;
                    var hasMinutesOrSecondsOrMilliseconds = minute > 0 || second > 0 || millisecond > 0;
                    if (
                        hour < (hasMinutesOrSecondsOrMilliseconds ? 24 : 25) &&
                        minute < 60 && second < 60 && millisecond < 1000 &&
                        month > -1 && month < 12 && hourOffset < 24 &&
                        minuteOffset < 60 && // detect invalid offsets
                        day > -1 &&
                        day < (dayFromMonth(year, month + 1) - dayFromMonth(year, month))
                    ) {
                        result = (
                            (dayFromMonth(year, month) + day) * 24 +
                            hour +
                            hourOffset * signOffset
                        ) * 60;
                        result = (
                            (result + minute + minuteOffset * signOffset) * 60 +
                            second
                        ) * 1000 + millisecond;
                        if (isLocalTime) {
                            result = toUTC(result);
                        }
                        if (-8.64e15 <= result && result <= 8.64e15) {
                            return result;
                        }
                    }
                    return NaN;
                }
                return NativeDate.parse.apply(this, arguments);
            };
            defineProperties(DateShim, { parse: parseShim });

            return DateShim;
        }(Date));
        /* global Date: false */
    }

    // ES5 15.9.4.4
    // http://es5.github.com/#x15.9.4.4
    if (!Date.now) {
        Date.now = function now() {
            return new Date().getTime();
        };
    }

    //
    // Number
    // ======
    //

    // ES5.1 15.7.4.5
    // http://es5.github.com/#x15.7.4.5
    var hasToFixedBugs = NumberPrototype.toFixed && (
      (0.00008).toFixed(3) !== '0.000' ||
      (0.9).toFixed(0) !== '1' ||
      (1.255).toFixed(2) !== '1.25' ||
      (1000000000000000128).toFixed(0) !== '1000000000000000128'
    );

    var toFixedHelpers = {
        base: 1e7,
        size: 6,
        data: [0, 0, 0, 0, 0, 0],
        multiply: function multiply(n, c) {
            var i = -1;
            var c2 = c;
            while (++i < toFixedHelpers.size) {
                c2 += n * toFixedHelpers.data[i];
                toFixedHelpers.data[i] = c2 % toFixedHelpers.base;
                c2 = Math.floor(c2 / toFixedHelpers.base);
            }
        },
        divide: function divide(n) {
            var i = toFixedHelpers.size;
            var c = 0;
            while (--i >= 0) {
                c += toFixedHelpers.data[i];
                toFixedHelpers.data[i] = Math.floor(c / n);
                c = (c % n) * toFixedHelpers.base;
            }
        },
        numToString: function numToString() {
            var i = toFixedHelpers.size;
            var s = '';
            while (--i >= 0) {
                if (s !== '' || i === 0 || toFixedHelpers.data[i] !== 0) {
                    var t = $String(toFixedHelpers.data[i]);
                    if (s === '') {
                        s = t;
                    } else {
                        s += strSlice('0000000', 0, 7 - t.length) + t;
                    }
                }
            }
            return s;
        },
        pow: function pow(x, n, acc) {
            return (n === 0 ? acc : (n % 2 === 1 ? pow(x, n - 1, acc * x) : pow(x * x, n / 2, acc)));
        },
        log: function log(x) {
            var n = 0;
            var x2 = x;
            while (x2 >= 4096) {
                n += 12;
                x2 /= 4096;
            }
            while (x2 >= 2) {
                n += 1;
                x2 /= 2;
            }
            return n;
        }
    };

    var toFixedShim = function toFixed(fractionDigits) {
        var f, x, s, m, e, z, j, k;

        // Test for NaN and round fractionDigits down
        f = $Number(fractionDigits);
        f = isActualNaN(f) ? 0 : Math.floor(f);

        if (f < 0 || f > 20) {
            throw new RangeError('Number.toFixed called with invalid number of decimals');
        }

        x = $Number(this);

        if (isActualNaN(x)) {
            return 'NaN';
        }

        // If it is too big or small, return the string value of the number
        if (x <= -1e21 || x >= 1e21) {
            return $String(x);
        }

        s = '';

        if (x < 0) {
            s = '-';
            x = -x;
        }

        m = '0';

        if (x > 1e-21) {
            // 1e-21 < x < 1e21
            // -70 < log2(x) < 70
            e = toFixedHelpers.log(x * toFixedHelpers.pow(2, 69, 1)) - 69;
            z = (e < 0 ? x * toFixedHelpers.pow(2, -e, 1) : x / toFixedHelpers.pow(2, e, 1));
            z *= 0x10000000000000; // Math.pow(2, 52);
            e = 52 - e;

            // -18 < e < 122
            // x = z / 2 ^ e
            if (e > 0) {
                toFixedHelpers.multiply(0, z);
                j = f;

                while (j >= 7) {
                    toFixedHelpers.multiply(1e7, 0);
                    j -= 7;
                }

                toFixedHelpers.multiply(toFixedHelpers.pow(10, j, 1), 0);
                j = e - 1;

                while (j >= 23) {
                    toFixedHelpers.divide(1 << 23);
                    j -= 23;
                }

                toFixedHelpers.divide(1 << j);
                toFixedHelpers.multiply(1, 1);
                toFixedHelpers.divide(2);
                m = toFixedHelpers.numToString();
            } else {
                toFixedHelpers.multiply(0, z);
                toFixedHelpers.multiply(1 << (-e), 0);
                m = toFixedHelpers.numToString() + strSlice('0.00000000000000000000', 2, 2 + f);
            }
        }

        if (f > 0) {
            k = m.length;

            if (k <= f) {
                m = s + strSlice('0.0000000000000000000', 0, f - k + 2) + m;
            } else {
                m = s + strSlice(m, 0, k - f) + '.' + strSlice(m, k - f);
            }
        } else {
            m = s + m;
        }

        return m;
    };
    defineProperties(NumberPrototype, { toFixed: toFixedShim }, hasToFixedBugs);

    var hasToPrecisionUndefinedBug = (function () {
        try {
            return 1.0.toPrecision(undefined) === '1';
        } catch (e) {
            return true;
        }
    }());
    var originalToPrecision = NumberPrototype.toPrecision;
    defineProperties(NumberPrototype, {
        toPrecision: function toPrecision(precision) {
            return typeof precision === 'undefined' ? originalToPrecision.call(this) : originalToPrecision.call(this, precision);
        }
    }, hasToPrecisionUndefinedBug);

    //
    // String
    // ======
    //

    // ES5 15.5.4.14
    // http://es5.github.com/#x15.5.4.14

    // [bugfix, IE lt 9, firefox 4, Konqueror, Opera, obscure browsers]
    // Many browsers do not split properly with regular expressions or they
    // do not perform the split correctly under obscure conditions.
    // See http://blog.stevenlevithan.com/archives/cross-browser-split
    // I've tested in many browsers and this seems to cover the deviant ones:
    //    'ab'.split(/(?:ab)*/) should be ["", ""], not [""]
    //    '.'.split(/(.?)(.?)/) should be ["", ".", "", ""], not ["", ""]
    //    'tesst'.split(/(s)*/) should be ["t", undefined, "e", "s", "t"], not
    //       [undefined, "t", undefined, "e", ...]
    //    ''.split(/.?/) should be [], not [""]
    //    '.'.split(/()()/) should be ["."], not ["", "", "."]

    if (
        'ab'.split(/(?:ab)*/).length !== 2 ||
        '.'.split(/(.?)(.?)/).length !== 4 ||
        'tesst'.split(/(s)*/)[1] === 't' ||
        'test'.split(/(?:)/, -1).length !== 4 ||
        ''.split(/.?/).length ||
        '.'.split(/()()/).length > 1
    ) {
        (function () {
            var compliantExecNpcg = typeof (/()??/).exec('')[1] === 'undefined'; // NPCG: nonparticipating capturing group
            var maxSafe32BitInt = Math.pow(2, 32) - 1;

            StringPrototype.split = function (separator, limit) {
                var string = String(this);
                if (typeof separator === 'undefined' && limit === 0) {
                    return [];
                }

                // If `separator` is not a regex, use native split
                if (!isRegex(separator)) {
                    return strSplit(this, separator, limit);
                }

                var output = [];
                var flags = (separator.ignoreCase ? 'i' : '') +
                            (separator.multiline ? 'm' : '') +
                            (separator.unicode ? 'u' : '') + // in ES6
                            (separator.sticky ? 'y' : ''), // Firefox 3+ and ES6
                    lastLastIndex = 0,
                    // Make `global` and avoid `lastIndex` issues by working with a copy
                    separator2, match, lastIndex, lastLength;
                var separatorCopy = new RegExp(separator.source, flags + 'g');
                if (!compliantExecNpcg) {
                    // Doesn't need flags gy, but they don't hurt
                    separator2 = new RegExp('^' + separatorCopy.source + '$(?!\\s)', flags);
                }
                /* Values for `limit`, per the spec:
                 * If undefined: 4294967295 // maxSafe32BitInt
                 * If 0, Infinity, or NaN: 0
                 * If positive number: limit = Math.floor(limit); if (limit > 4294967295) limit -= 4294967296;
                 * If negative number: 4294967296 - Math.floor(Math.abs(limit))
                 * If other: Type-convert, then use the above rules
                 */
                var splitLimit = typeof limit === 'undefined' ? maxSafe32BitInt : ES.ToUint32(limit);
                match = separatorCopy.exec(string);
                while (match) {
                    // `separatorCopy.lastIndex` is not reliable cross-browser
                    lastIndex = match.index + match[0].length;
                    if (lastIndex > lastLastIndex) {
                        pushCall(output, strSlice(string, lastLastIndex, match.index));
                        // Fix browsers whose `exec` methods don't consistently return `undefined` for
                        // nonparticipating capturing groups
                        if (!compliantExecNpcg && match.length > 1) {
                            /* eslint-disable no-loop-func */
                            match[0].replace(separator2, function () {
                                for (var i = 1; i < arguments.length - 2; i++) {
                                    if (typeof arguments[i] === 'undefined') {
                                        match[i] = void 0;
                                    }
                                }
                            });
                            /* eslint-enable no-loop-func */
                        }
                        if (match.length > 1 && match.index < string.length) {
                            array_push.apply(output, arraySlice(match, 1));
                        }
                        lastLength = match[0].length;
                        lastLastIndex = lastIndex;
                        if (output.length >= splitLimit) {
                            break;
                        }
                    }
                    if (separatorCopy.lastIndex === match.index) {
                        separatorCopy.lastIndex++; // Avoid an infinite loop
                    }
                    match = separatorCopy.exec(string);
                }
                if (lastLastIndex === string.length) {
                    if (lastLength || !separatorCopy.test('')) {
                        pushCall(output, '');
                    }
                } else {
                    pushCall(output, strSlice(string, lastLastIndex));
                }
                return output.length > splitLimit ? arraySlice(output, 0, splitLimit) : output;
            };
        }());

    // [bugfix, chrome]
    // If separator is undefined, then the result array contains just one String,
    // which is the this value (converted to a String). If limit is not undefined,
    // then the output array is truncated so that it contains no more than limit
    // elements.
    // "0".split(undefined, 0) -> []
    } else if ('0'.split(void 0, 0).length) {
        StringPrototype.split = function split(separator, limit) {
            if (typeof separator === 'undefined' && limit === 0) {
                return [];
            }
            return strSplit(this, separator, limit);
        };
    }

    var str_replace = StringPrototype.replace;
    var replaceReportsGroupsCorrectly = (function () {
        var groups = [];
        'x'.replace(/x(.)?/g, function (match, group) {
            pushCall(groups, group);
        });
        return groups.length === 1 && typeof groups[0] === 'undefined';
    }());

    if (!replaceReportsGroupsCorrectly) {
        StringPrototype.replace = function replace(searchValue, replaceValue) {
            var isFn = isCallable(replaceValue);
            var hasCapturingGroups = isRegex(searchValue) && (/\)[*?]/).test(searchValue.source);
            if (!isFn || !hasCapturingGroups) {
                return str_replace.call(this, searchValue, replaceValue);
            } else {
                var wrappedReplaceValue = function (match) {
                    var length = arguments.length;
                    var originalLastIndex = searchValue.lastIndex;
                    searchValue.lastIndex = 0;
                    var args = searchValue.exec(match) || [];
                    searchValue.lastIndex = originalLastIndex;
                    pushCall(args, arguments[length - 2], arguments[length - 1]);
                    return replaceValue.apply(this, args);
                };
                return str_replace.call(this, searchValue, wrappedReplaceValue);
            }
        };
    }

    // ECMA-262, 3rd B.2.3
    // Not an ECMAScript standard, although ECMAScript 3rd Edition has a
    // non-normative section suggesting uniform semantics and it should be
    // normalized across all browsers
    // [bugfix, IE lt 9] IE < 9 substr() with negative value not working in IE
    var string_substr = StringPrototype.substr;
    var hasNegativeSubstrBug = ''.substr && '0b'.substr(-1) !== 'b';
    defineProperties(StringPrototype, {
        substr: function substr(start, length) {
            var normalizedStart = start;
            if (start < 0) {
                normalizedStart = max(this.length + start, 0);
            }
            return string_substr.call(this, normalizedStart, length);
        }
    }, hasNegativeSubstrBug);

    // ES5 15.5.4.20
    // whitespace from: http://es5.github.io/#x15.5.4.20
    var ws = '\x09\x0A\x0B\x0C\x0D\x20\xA0\u1680\u180E\u2000\u2001\u2002\u2003' +
        '\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000\u2028' +
        '\u2029\uFEFF';
    var zeroWidth = '\u200b';
    var wsRegexChars = '[' + ws + ']';
    var trimBeginRegexp = new RegExp('^' + wsRegexChars + wsRegexChars + '*');
    var trimEndRegexp = new RegExp(wsRegexChars + wsRegexChars + '*$');
    var hasTrimWhitespaceBug = StringPrototype.trim && (ws.trim() || !zeroWidth.trim());
    defineProperties(StringPrototype, {
        // http://blog.stevenlevithan.com/archives/faster-trim-javascript
        // http://perfectionkills.com/whitespace-deviations/
        trim: function trim() {
            if (typeof this === 'undefined' || this === null) {
                throw new TypeError("can't convert " + this + ' to object');
            }
            return $String(this).replace(trimBeginRegexp, '').replace(trimEndRegexp, '');
        }
    }, hasTrimWhitespaceBug);
    var trim = call.bind(String.prototype.trim);

    var hasLastIndexBug = StringPrototype.lastIndexOf && 'abcあい'.lastIndexOf('あい', 2) !== -1;
    defineProperties(StringPrototype, {
        lastIndexOf: function lastIndexOf(searchString) {
            if (typeof this === 'undefined' || this === null) {
                throw new TypeError("can't convert " + this + ' to object');
            }
            var S = $String(this);
            var searchStr = $String(searchString);
            var numPos = arguments.length > 1 ? $Number(arguments[1]) : NaN;
            var pos = isActualNaN(numPos) ? Infinity : ES.ToInteger(numPos);
            var start = min(max(pos, 0), S.length);
            var searchLen = searchStr.length;
            var k = start + searchLen;
            while (k > 0) {
                k = max(0, k - searchLen);
                var index = strIndexOf(strSlice(S, k, start + searchLen), searchStr);
                if (index !== -1) {
                    return k + index;
                }
            }
            return -1;
        }
    }, hasLastIndexBug);

    var originalLastIndexOf = StringPrototype.lastIndexOf;
    defineProperties(StringPrototype, {
        lastIndexOf: function lastIndexOf(searchString) {
            return originalLastIndexOf.apply(this, arguments);
        }
    }, StringPrototype.lastIndexOf.length !== 1);

    // ES-5 15.1.2.2
    /* eslint-disable radix */
    if (parseInt(ws + '08') !== 8 || parseInt(ws + '0x16') !== 22) {
    /* eslint-enable radix */
        /* global parseInt: true */
        parseInt = (function (origParseInt) {
            var hexRegex = /^[\-+]?0[xX]/;
            return function parseInt(str, radix) {
                var string = trim(String(str));
                var defaultedRadix = $Number(radix) || (hexRegex.test(string) ? 16 : 10);
                return origParseInt(string, defaultedRadix);
            };
        }(parseInt));
    }

    // https://es5.github.io/#x15.1.2.3
    if (1 / parseFloat('-0') !== -Infinity) {
        /* global parseFloat: true */
        parseFloat = (function (origParseFloat) {
            return function parseFloat(string) {
                var inputString = trim(String(string));
                var result = origParseFloat(inputString);
                return result === 0 && strSlice(inputString, 0, 1) === '-' ? -0 : result;
            };
        }(parseFloat));
    }

    if (String(new RangeError('test')) !== 'RangeError: test') {
        var errorToStringShim = function toString() {
            if (typeof this === 'undefined' || this === null) {
                throw new TypeError("can't convert " + this + ' to object');
            }
            var name = this.name;
            if (typeof name === 'undefined') {
                name = 'Error';
            } else if (typeof name !== 'string') {
                name = $String(name);
            }
            var msg = this.message;
            if (typeof msg === 'undefined') {
                msg = '';
            } else if (typeof msg !== 'string') {
                msg = $String(msg);
            }
            if (!name) {
                return msg;
            }
            if (!msg) {
                return name;
            }
            return name + ': ' + msg;
        };
        // can't use defineProperties here because of toString enumeration issue in IE <= 8
        Error.prototype.toString = errorToStringShim;
    }

    if (supportsDescriptors) {
        var ensureNonEnumerable = function (obj, prop) {
            if (isEnum(obj, prop)) {
                var desc = Object.getOwnPropertyDescriptor(obj, prop);
                if (desc.configurable) {
                    desc.enumerable = false;
                    Object.defineProperty(obj, prop, desc);
                }
            }
        };
        ensureNonEnumerable(Error.prototype, 'message');
        if (Error.prototype.message !== '') {
            Error.prototype.message = '';
        }
        ensureNonEnumerable(Error.prototype, 'name');
    }

    if (String(/a/mig) !== '/a/gim') {
        var regexToString = function toString() {
            var str = '/' + this.source + '/';
            if (this.global) {
                str += 'g';
            }
            if (this.ignoreCase) {
                str += 'i';
            }
            if (this.multiline) {
                str += 'm';
            }
            return str;
        };
        // can't use defineProperties here because of toString enumeration issue in IE <= 8
        RegExp.prototype.toString = regexToString;
    }
}));


/***/ }),
/* 5 */
/***/ (function(module, exports) {

// removed by extract-text-webpack-plugin
module.exports = {"screen-cover":"screen-cover","rebeccapurple":"rebeccapurple","black":"black","cover-app-loading":"cover-app-loading","cover-request-loading":"cover-request-loading","info":"info","animation":"animation","text":"text","nprogress":"nprogress","bar":"bar","peg":"peg","spinner":"spinner","header":"header","navbar-inner":"navbar-inner","brand":"brand","page-container":"page-container","page-content":"page-content","page-sidebar":"page-sidebar","btn-navbar":"btn-navbar","pc":"pc","page-content-area":"page-content-area","page-sidebar-closed":"page-sidebar-closed","eb-richform":"eb-richform","span12":"span12","span6":"span6","btn-group":"btn-group","window-modal-lookup":"window-modal-lookup","window-modal":"window-modal","eb-panel-title":"eb-panel-title","sub-menu":"sub-menu","arrow":"arrow","open":"open","page-sidebar-menu":"page-sidebar-menu","fa":"fa","title":"title","form-control":"form-control","btn":"btn","datetimepicker":"datetimepicker","eb-panel":"eb-panel","caption":"caption","eb-panel-body":"eb-panel-body","blue":"blue","purple":"purple","eb-richipt":"eb-richipt","controls":"controls","eb-richipt-select":"eb-richipt-select","multiselect":"multiselect","eb-richipt-multiselect":"eb-richipt-multiselect","caret":"caret","eb-richipt-textarea":"eb-richipt-textarea","eb-richbtn":"eb-richbtn","green":"green","red":"red","eb-button-group":"eb-button-group","left":"left","right":"right","eb-datagrid":"eb-datagrid","action-link":"action-link","modal-backdrop":"modal-backdrop","window-modal-alert":"window-modal-alert","window-modal-confirm":"window-modal-confirm"};

/***/ }),
/* 6 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


var _artTemplate = __webpack_require__(27);

var _artTemplate2 = _interopRequireDefault(_artTemplate);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { 'default': obj }; }

var tplengine = {
    parse: function parse(tplName, data) {

        return (0, _artTemplate2['default'])('art-' + tplName, data);
    }
};

module.exports = tplengine;

/***/ }),
/* 7 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


/**
 * 客户端
 * @param options
 * @returns {Client}
 * @constructor
 */
var Client = function Client(options) {
    if (!(this instanceof Client)) {
        return new Client(options);
    } else {
        var opts = options || {};
        this.requestHeader = opts.requestHeader || false;
        this.requestParam = opts.requestParam || false;
        this.requestData = opts.requestData || false;

        this.url = opts.url || eb.app.config.DEFAULT_URL;
        this.method = opts.method || eb.app.config.DEFAULT_METHOD;
        this.async = opts.async || true;

        // 回调相关
        // 请求校验
        this.onValidation = opts.onValidation || function () {
            return true;
        };
        // 请求前
        this.onSending = opts.onSending || function () {};
        // 成功
        this.onSuccess = opts.onSuccess || function (response) {
            eb.log.info(JSON.stringify(response));
        };
        // 失败
        this.onFail = opts.onFail || function (response) {
            eb.log.error(JSON.stringify(response));
        };
        // 请求后
        this.onComplete = opts.onComplete || function () {};
        // 事件订阅器
        this.eventId = opts.eventId || 'none';
        this.proxyEvent = opts.proxyEvent || false;

        // 响应适配器：用于适配异形 REST 接口
        // 默认实现是认为REST接口是可靠的标准数据结构，而仅仅将HTML类型响应转换成标准响应数据结构
        this.responseAdapter = opts.responseAdapter || function (responseText, status, statusText) {
            var flag = status === 200 ? 0 : status;
            if (responseText.match(/^\{[\w\W]*\}$/m)) {
                try {
                    var resultObj = JSON.parse(responseText);

                    // 适配 SCF 响应数据结构
                    if (typeof resultObj.result !== 'undefined') {
                        return {
                            flag: resultObj.result,
                            data: resultObj.resultData,
                            msg: resultObj.resultNote,
                            err: resultObj.resultErrorMap
                        };
                    }

                    return resultObj;
                } catch (e) {
                    return {
                        flag: flag === 0 ? -1 : flag,
                        data: responseText,
                        msg: statusText
                    };
                }
            } else {
                return {
                    flag: flag,
                    data: responseText,
                    msg: statusText
                };
            }
        };

        this.before = function (func) {
            this.onSending = func;
            return this;
        };

        this.ifSuccess = function (func) {
            this.onSuccess = func;
            return this;
        };

        this.ifFail = function (func) {
            this.onFail = func;
            return this;
        };

        this.after = function (func) {
            this.onComplete = func;
            return this;
        };

        /**
         * 设置请求地址
         * @param url
         * @returns {Client}
         */
        this.setUrl = function (url) {
            this.url = url;
            return this;
        };

        /**
         * 请求方法：下载
         * @returns {Client}
         */
        this.download = function () {
            try {
                var elem = document.createElement("iframe");
                elem.src = this.url;
                elem.style.display = "none";
                document.body.appendChild(elem);
            } catch (e) {
                this.onFail({
                    flag: -1,
                    data: e,
                    msg: 'Cannot create download iframe for "' + this.url + '"!'
                });
            } finally {
                return this;
            }
        };

        /**
         * 请求方法：发送REST请求
         * @returns {Client}
         */
        this.send = function () {
            // 校验
            if (!this.onValidation(this)) return;

            // 请求发送前操作
            this.onSending();

            var xmlhttp = window.XMLHttpRequest ? new XMLHttpRequest() : new ActiveXObject("Microsoft.XMLHTTP");
            xmlhttp.client = this;

            if (xmlhttp != null) {
                xmlhttp.onreadystatechange = function () {
                    if (xmlhttp.readyState === 4) {
                        var response = this.client.responseAdapter(xmlhttp.responseText, xmlhttp.status, xmlhttp.statusText);

                        eb.log.debug("Message Received: " + JSON.stringify(response));

                        if (!response.flag) {
                            this.client.onSuccess(response);

                            /*if (this.client.eventProxy)
                            {
                                this.client.eventProxy.emit(this.client.eventId, response);
                            }*/
                        } else {
                            this.client.onFail(response);
                        }

                        this.client.onComplete();

                        //historyMeta.endTime = new Date();
                        //this.client.history.push(historyMeta);
                    }
                };

                xmlhttp.open(this.method, this.requestParam ? function (url, params) {
                    var paramArr = [];
                    for (var key in params) {
                        paramArr.push(key + '=' + params[key]);
                    }
                    return url + (url.indexOf('?') > 0 ? '&' : '?') + paramArr.join('&');
                }(this.url, this.requestParam) : this.url, this.async);

                // 设置header
                xmlhttp.setRequestHeader("Content-Type", "application/json");
                if (this.requestHeader) {
                    for (var key in this.requestHeader) {
                        xmlhttp.setRequestHeader(key, this.requestHeader[key]);
                    }
                }

                // 发送前重绑撤销方法
                this.abort = function () {
                    xmlhttp.abort();
                    return this;
                };

                xmlhttp.send(this.requestData ? JSON.stringify(this.requestData) : "{}");
                eb.log.debug('Request Sent: ' + this.url + " (" + 'Data: ' + JSON.stringify(this.requestData) + ")");
            } else {
                // This will never happen!
                eb.log.error('Your browser does not support XMLHttp!');
            }

            return this;
        };

        this.abort = function () {
            return this;
        };
    }
};

module.exports = Client;

/***/ }),
/* 8 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


Array.prototype.contains = function (obj) {
    var i = this.length;
    while (i--) {
        if (this[i] === obj) {
            return true;
        }
    }
    return false;
};

/**
 * 事件订阅器
 * @param options
 *        {
 *          events: []
 *          callback: function(triggeredEvents)
 *        }
 * @returns {EventProxy}
 * @constructor
 */
var EventProxy = function EventProxy(options) {
    if (!(this instanceof EventProxy)) {
        return new EventProxy(options);
    } else {
        this.events = options.events || [];
        this.callback = options.callback || function (triggeredEvents) {};
        this.triggeredEvents = {
            count: 0,
            finished: false
        };

        this.emit = function (eventName, data) {
            if (!this.events.contains(eventName)) {
                eb.log.error("Event proxy can't handle '" + eventName + "'! ");
                return;
            }

            if (!this.triggeredEvents[eventName]) {
                this.triggeredEvents.count++;
            }
            this.triggeredEvents[eventName] = data;

            if (this.triggeredEvents.count === this.events.length && !this.triggeredEvents.finished) {
                this.callback(this.triggeredEvents);
                this.triggeredEvents.finished = true;
            }
        };
    }
};

module.exports = EventProxy;

/***/ }),
/* 9 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


module.exports = {
    LOG_LEVEL: 'DEBUG',

    MUTI_VAL_SEP: ';',

    APP_NAME: 'Enbrau Studio'

};

/***/ }),
/* 10 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


module.exports = {

    init: function init(target, options) {
        target.find('input').iCheck({
            checkboxClass: 'icheckbox_minimal',
            radioClass: 'iradio_minimal',
            increaseArea: '20%'
        });
    }

};

/***/ }),
/* 11 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


module.exports = {

    init: function init(target, options) {
        target.find('.eb-richbtn-lookup').attr('data-toggle', 'tooltip');
        target.find('.eb-richbtn-lookup').attr('data-placement', 'right');

        eb.component.RichInput.call(target, 'triggerValidation', {
            showResult: false
        });

        target.find('input').keyup(function () {
            eb.component.RichInput.call(target, 'triggerValidation', {
                showResult: true
            });
        });
    },

    setValidationResult: function setValidationResult(target, options) {
        var result = options.result || 'passed';

        target.attr('data-validation', result === 'passed' ? 'true' : 'false');

        target.find(".eb-richbtn-lookup").attr('title', result === 'passed' ? '' : result);
        target.find(".eb-richbtn-lookup").attr('data-original-title', result === 'passed' ? '' : result);
    },

    showValidationResult: function showValidationResult(target, options) {
        target.find(".eb-richbtn-lookup").tooltip("show");
    },

    hideValidationResult: function hideValidationResult(target, options) {
        target.find(".eb-richbtn-lookup").tooltip("hide");
    },

    getValue: function getValue(target, options) {
        return target.find('input').val();
    },

    setValue: function setValue(target, options) {
        var value = typeof options === 'string' ? options : options.value;
        target.find('input').val(value);
        target.find('input').keyup();

        eb.component.RichInput.call(target, 'triggerValidation');
    },

    show: function show(target, options) {
        // TODO
    },

    hide: function hide(target, options) {
        // TODO
    },

    lock: function lock(target, options) {
        target.attr('data-readonly', 'true');
        target.find('input').attr('disabled', 'disabled');
    },

    unlock: function unlock(target, options) {
        if (!options.temp) target.attr('data-readonly', 'true');
        target.find('input').removeAttr('disabled');
    },

    onChange: function onChange(target, callback) {
        target.find('input').keyup(function (e) {
            eb.component.RichInput.call(target, 'triggerValidation', {
                showResult: true
            });

            var value = eb.component.RichInput.call(target, 'getValue');

            callback(value);
        });
    },

    bindLookupReqDataCollector: function bindLookupReqDataCollector(target, callback) {
        target.find('.eb-richbtn-lookup').data('reqDataCollector', callback);
    }

};

/***/ }),
/* 12 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


module.exports = {

    init: function init(target, options) {
        target.find('select').multiselect({
            enableFiltering: false,
            nonSelectedText: '请选择',
            onChange: function onChange(event) {
                eb.component.RichInput.call(target, 'triggerValidation', {
                    showResult: true
                });
            }
        });

        target.find(".btn-group").attr('data-toggle', 'tooltip');
        target.find(".btn-group").attr('data-placement', 'right');

        eb.component.RichInput.call(target, 'triggerValidation', {
            showResult: false
        });
    },

    setValidationResult: function setValidationResult(target, options) {
        var result = options.result || 'passed';

        target.attr('data-validation', result === 'passed' ? 'true' : 'false');

        target.find(".btn-group").attr('title', result === 'passed' ? '' : result);
        target.find(".btn-group").attr('data-original-title', result === 'passed' ? '' : result);
    },

    showValidationResult: function showValidationResult(target, options) {
        target.find(".btn-group").tooltip("show");
    },

    hideValidationResult: function hideValidationResult(target, options) {
        target.find(".btn-group").tooltip("hide");
    },

    setValue: function setValue(target, options) {
        var value = options.value || "";

        target.find('select').val(value.split(eb.settings.MUTI_VAL_SEP));
        target.find('select').multiselect('refresh');

        eb.component.RichInput.call(target, 'triggerValidation', {
            showResult: true
        });
    },

    getValue: function getValue(target, options) {
        var value = target.find('select').val();
        return value ? value.join(eb.settings.MUTI_VAL_SEP) : "";
    },

    show: function show(target, options) {
        // TODO
    },

    hide: function hide(target, options) {
        // TODO
    },

    lock: function lock(target, options) {
        target.find('select').multiselect('disable');
    },

    unlock: function unlock(target, options) {
        target.find('select').multiselect('enable');
    },

    setOptions: function setOptions(target, options) {
        var values = eb.component.RichInput.call(target, 'getValue').split(";");
        var dataProvider = [];
        var opts = options.dict || [];

        if ($.isArray(opts)) {
            for (var i = 0; i < opts.length; i++) {
                var item = {};
                item.value = opts[i].key;
                item.title = opts[i].value;
                item.label = opts[i].value;

                for (var j = 0; j < values.length; j++) {
                    if (item.value == values[i]) {
                        item.selected = true;
                    }
                }

                dataProvider.push(item);
            }
        } else {
            for (var key in opts) {
                var newItem = {};
                newItem.label = opts[key];
                newItem.value = key;

                for (var j = 0; j < values.length; j++) {
                    if (key == values[i]) {
                        newItem.selected = true;
                    }
                }
                dataProvider.push(newItem);
            }
        }

        target.find("select").multiselect('dataprovider', dataProvider);
    },

    onChange: function onChange(target, callback) {
        target.find('select').multiselect('setOptions', {
            onChange: function onChange(event) {
                eb.component.RichInput.call(target, 'triggerValidation', {
                    showResult: true
                });

                var value = eb.component.RichInput.call(target, 'getValue');

                callback(value);
            }
        });
    }

};

/***/ }),
/* 13 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


module.exports = {

    init: function init(target, options) {
        target.find('.fa').click(function (e) {
            if ($(this).hasClass('fa-eye')) {
                $(this).removeClass('fa-eye');
                $(this).addClass('fa-eye-slash ');
                $(this).siblings('input').attr('type', 'text');
            } else {
                $(this).removeClass('fa-eye-slash');
                $(this).addClass('fa-eye');
                $(this).siblings('input').attr('type', 'password');
            }
        });

        eb.component.RichInput.call(target, 'triggerValidation', {
            showResult: false
        });

        target.find('input').keyup(function () {
            eb.component.RichInput.call(target, 'triggerValidation', {
                showResult: true
            });
        });
    },

    setValidationResult: function setValidationResult(target, options) {
        var result = options.result || 'passed';

        target.attr('data-validation', result === 'passed' ? 'true' : 'false');

        target.find("input").attr('title', result === 'passed' ? '' : result);
        target.find("input").attr('data-original-title', result === 'passed' ? '' : result);
    },

    showValidationResult: function showValidationResult(target, options) {
        target.find("input").tooltip("show");
    },

    hideValidationResult: function hideValidationResult(target, options) {
        target.find("input").tooltip("hide");
    },

    getValue: function getValue(target, options) {
        return target.find('input').val();
    },

    setValue: function setValue(target, options) {
        var value = typeof options === 'string' ? options : options.value;
        target.find('input').val(value);

        eb.component.RichInput.call(target, 'triggerValidation');
    },

    show: function show(target, options) {
        // TODO
    },

    hide: function hide(target, options) {
        // TODO
    },

    lock: function lock(target, options) {
        target.attr('data-readonly', 'true');
        target.find('input').attr('disabled', 'disabled');
    },

    unlock: function unlock(target, options) {
        if (!options.temp) target.attr('data-readonly', 'true');
        target.find('input').removeAttr('disabled');
    },

    onChange: function onChange(target, callback) {
        target.find('input').keyup(function (e) {
            eb.component.RichInput.call(target, 'triggerValidation', {
                showResult: true
            });

            var value = eb.component.RichInput.call(target, 'getValue');

            callback(value);
        });
    }

};

/***/ }),
/* 14 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


module.exports = {

    init: function init(target, options) {
        target.find('input').iCheck({
            checkboxClass: 'icheckbox_minimal',
            radioClass: 'iradio_minimal',
            increaseArea: '20%' // optional
        });
    }

};

/***/ }),
/* 15 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


module.exports = {

    init: function init(target, options) {
        target.find('select').multiselect({
            enableFiltering: false,
            nonSelectedText: '请选择',
            onChange: function onChange(event) {
                eb.component.RichInput.call(target, 'triggerValidation', {
                    showResult: true
                });
            }
        });

        target.find(".btn-group").attr('data-toggle', 'tooltip');
        target.find(".btn-group").attr('data-placement', 'right');

        eb.component.RichInput.call(target, 'triggerValidation', {
            showResult: false
        });
    },

    setValidationResult: function setValidationResult(target, options) {
        var result = options.result || 'passed';

        target.attr('data-validation', result === 'passed' ? 'true' : 'false');

        target.find(".btn-group").attr('title', result === 'passed' ? '' : result);
        target.find(".btn-group").attr('data-original-title', result === 'passed' ? '' : result);
    },

    showValidationResult: function showValidationResult(target, options) {
        target.find(".btn-group").tooltip("show");
    },

    hideValidationResult: function hideValidationResult(target, options) {
        target.find(".btn-group").tooltip("hide");
    },

    setValue: function setValue(target, options) {
        target.find('select').val(options.value);
        target.find('select').multiselect('refresh');

        eb.component.RichInput.call(target, 'triggerValidation', {
            showResult: true
        });
    },

    getValue: function getValue(target, options) {
        return target.find('select').val();
    },

    show: function show(target, options) {
        // TODO
    },

    hide: function hide(target, options) {
        // TODO
    },

    lock: function lock(target, options) {
        target.find('select').multiselect('disable');
    },

    unlock: function unlock(target, options) {
        target.find('select').multiselect('enable');
    },

    setOptions: function setOptions(target, options) {
        var value = eb.component.RichInput.call(target, 'getValue');
        var dataProvider = [];
        var opts = options.dict || [];

        if ($.isArray(opts)) {
            for (var i = 0; i < opts.length; i++) {
                var item = {};
                item.value = opts[i].key;
                item.title = opts[i].value;
                item.label = opts[i].value;

                if (item.value == value) {
                    item.selected = true;
                }

                dataProvider.push(item);
            }
        } else {
            for (var key in opts) {
                var newItem = {};
                newItem.label = opts[key];
                newItem.value = key;

                if (newItem.value == value) {
                    newItem.selected = true;
                }

                dataProvider.push(newItem);
            }
        }

        target.find("select").multiselect('dataprovider', dataProvider);
    },

    onChange: function onChange(target, callback) {
        target.find('select').multiselect('setOptions', {
            onChange: function onChange(event) {
                eb.component.RichInput.call(target, 'triggerValidation', {
                    showResult: true
                });

                var value = eb.component.RichInput.call(target, 'getValue');

                callback(value);
            }
        });
    }

};

/***/ }),
/* 16 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


module.exports = {

    init: function init(target, options) {
        eb.component.RichInput.call(target, 'triggerValidation', {
            showResult: false
        });

        target.find('input').keyup(function () {
            eb.component.RichInput.call(target, 'triggerValidation', {
                showResult: true
            });
        });
    },

    setValidationResult: function setValidationResult(target, options) {
        var result = options.result || 'passed';

        target.attr('data-validation', result === 'passed' ? 'true' : 'false');

        target.find("input").attr('title', result === 'passed' ? '' : result);
        target.find("input").attr('data-original-title', result === 'passed' ? '' : result);
    },

    showValidationResult: function showValidationResult(target, options) {
        target.find("input").tooltip("show");
    },

    hideValidationResult: function hideValidationResult(target, options) {
        target.find("input").tooltip("hide");
    },

    getValue: function getValue(target, options) {
        return target.find('input').val();
    },

    setValue: function setValue(target, options) {
        var value = typeof options === 'string' ? options : options.value;
        target.find('input').val(value);
        target.find('input').keyup();

        eb.component.RichInput.call(target, 'triggerValidation');
    },

    show: function show(target, options) {
        // TODO
    },

    hide: function hide(target, options) {
        // TODO
    },

    lock: function lock(target, options) {
        target.attr('data-readonly', 'true');
        target.find('input').attr('disabled', 'disabled');
    },

    unlock: function unlock(target, options) {
        if (!options.temp) target.attr('data-readonly', 'true');
        target.find('input').removeAttr('disabled');
    },

    onChange: function onChange(target, callback) {
        target.find('input').keyup(function (e) {
            eb.component.RichInput.call(target, 'triggerValidation', {
                showResult: true
            });

            var value = eb.component.RichInput.call(target, 'getValue');

            callback(value);
        });
    }

};

/***/ }),
/* 17 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


module.exports = {

    init: function init(target, options) {}

};

/***/ }),
/* 18 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


var _module$exports;

function _defineProperty(obj, key, value) { if (key in obj) { Object.defineProperty(obj, key, { value: value, enumerable: true, configurable: true, writable: true }); } else { obj[key] = value; } return obj; }

module.exports = (_module$exports = {

    init: function init(target, options) {
        var subType = target.attr('data-eb-subtype');

        var format = 'yyyy-mm-dd hh:ii:ss',
            minView = 'hour',
            maxView = 'year',
            startView = 'month';

        if (subType === 'date') {
            format = 'yyyy-mm-dd';
            minView = 'year';
        }
        if (subType === 'time') {
            format = 'hh:ii:ss';
            maxView = 'hour';
            minView = 'hour';
            startView = 'day';
        }

        target.find('input').attr('data-date-format', format);

        target.find('input').datetimepicker({
            language: 'zh-CN',
            startView: startView,
            minView: minView,
            maxView: maxView,
            autoclose: true,
            todayBtn: 1,
            keyboardNavigation: true
        });

        eb.component.RichInput.call(target, 'triggerValidation', {
            showResult: false
        });
    },

    setValidationResult: function setValidationResult(target, options) {
        var result = options.result || 'passed';

        target.attr('data-validation', result === 'passed' ? 'true' : 'false');

        target.find("input").attr('title', result === 'passed' ? '' : result);
        target.find("input").attr('data-original-title', result === 'passed' ? '' : result);
    },

    showValidationResult: function showValidationResult(target, options) {
        target.find("input").tooltip("show");
    },

    hideValidationResult: function hideValidationResult(target, options) {
        target.find("input").tooltip("hide");
    },

    getValue: function getValue(target, options) {
        return target.find('input').val();
    },

    setValue: function setValue(target, options) {
        var value = typeof options === 'string' ? options : options.value;
        target.find('input').val(value);

        eb.component.RichInput.call(target, 'triggerValidation');
    },

    lock: function lock(target, options) {
        target.attr('data-readonly', 'true');
        target.find('input').attr('disabled', 'disabled');
    },

    unlock: function unlock(target, options) {
        if (!options.temp) target.attr('data-readonly', 'true');
        target.find('input').removeAttr('disabled');
    },

    show: function show(target, options) {
        // TODO
    },

    hide: function hide(target, options) {
        // TODO
    }

}, _defineProperty(_module$exports, 'lock', function lock(target, options) {
    target.attr('data-readonly', 'true');
    target.find('input').attr('disabled', 'disabled');
}), _defineProperty(_module$exports, 'unlock', function unlock(target, options) {
    if (!options.temp) target.attr('data-readonly', 'true');
    target.find('input').removeAttr('disabled');
}), _defineProperty(_module$exports, 'onChange', function onChange(target, callback) {
    target.find('input').keyup(function (e) {
        eb.component.RichInput.call(target, 'triggerValidation', {
            showResult: true
        });

        var value = eb.component.RichInput.call(target, 'getValue');

        callback(value);
    });
}), _module$exports);

/***/ }),
/* 19 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


module.exports = {

    init: function init(target, options) {
        var opts = $.extend({}, options);
        opts.sourceUrl = target.attr('data-source-url') || options.sourceUrl || null;
        opts.selectStrategy = target.attr('data-select-strategy') || options.selectStrategy || 'multi';
        opts.keyField = target.attr('data-key-field') || options.keyField;
        opts.valueField = target.attr('data-value-field') || options.valueField;
        opts.idField = target.attr('data-id-field') || options.idField;
        opts.pidField = target.attr('data-pid-field') || options.pidField;
        opts.childrenField = target.attr('data-children-field') || options.childrenField;
        opts.valueScope = target.attr('data-value-scope') || options.valueScope || 'all';

        eb.component.saveOptions(target, opts);

        var targetId = target.attr('id');
        var treeData = options.treeData || null;

        /*const parseTreeNodes = function (treeDataRaw, value) {
            let result = [];
            let keyField      = opts.keyField;
            let valueField    = opts.valueField;
            let childrenField = opts.childrenField;
              const getNewNode = function (nodeRaw) {
                let node = {
                    text: nodeRaw[valueField]
                };
                  if (nodeRaw[childrenField])
                {
                    let childrenNodes = nodeRaw[childrenField];
                      node.nodes = [];
                    for (let i=0; i<childrenNodes.length; i++)
                    {
                        node.nodes.push(getNewNode(childrenNodes[i]));
                    }
                }
                  return node;
            };
              for (let i=0; i<treeDataRaw.length; i++)
            {
                let node = getNewNode(treeDataRaw[i]);
                result.push(node);
            }
              return result;
        };*/

        var initTreeView = function initTreeView(treeDataRaw) {
            //let treeData = parseTreeNodes(treeDataRaw);

            var keyField = opts.keyField;
            var valueField = opts.valueField;
            var idField = opts.idField;
            var pidField = opts.pidField;
            var childrenField = opts.childrenField;
            var selectStrategy = opts.selectStrategy;
            var valueScope = opts.valueScope;

            var settings = {
                data: {
                    key: {
                        title: valueField,
                        checked: "ztreeItemSelected",
                        name: valueField,
                        children: childrenField
                    },
                    simpleData: {
                        enable: true,
                        idKey: idField,
                        pIdKey: pidField
                        //rootPId: null
                    }
                },
                check: {
                    enable: true,
                    chkStyle: selectStrategy == "single" ? "radio" : "checkbox",
                    radioType: "all",
                    chkboxType: { "Y": "ps", "N": "ps" }
                },
                callback: {
                    beforeClick: function beforeClick() {},
                    onClick: function onClick(event, treeId, treeNode, clickFlag) {
                        // target.find("#" + target.attr("id") + "-value-input").val(treeNode[target.attr("data-valueField")]);
                        event.stopPropagation();
                        return false;
                    },
                    onCheck: function onCheck(event, treeId, treeNode) {
                        event.stopPropagation();

                        var ztreeObj = $.fn.zTree.getZTreeObj('#' + targetId + '-treeview');

                        var nodes = ztreeObj.getNodesByFilter(function (node) {

                            switch (valueScope) {
                                case "children":
                                    if (node.ztreeItemSelected && !node.isParent) return true;
                                    break;
                                case "all":
                                    if (node.ztreeItemSelected) return true;
                                    break;
                            }

                            return false;
                        }, false);

                        var treeValues = [];
                        var treeLabels = [];
                        for (var i = 0; i < nodes.length; i++) {
                            var node = nodes[i];
                            treeValues.push(node[keyField]);
                            treeLabels.push(node[valueField]);
                        }

                        //target.find("#" + target.attr("id") + "-value-input").val(treeValues.join(eb.settings.MUTI_VAL_SEP));
                        //target.find("button").html((treeLabels.length==1 ? treeLabels.join(eb.settings.MUTI_VAL_SEP) : "选中了 " + treeLabels.length + " 项") + "<span class=\"icon\"></span>");
                        //target.find("button").attr("title", treeLabels.join(eb.settings.MUTI_VAL_SEP));

                        //if (!options.skipInitialValidation && options.validator) options.validator.exec(true);
                    }
                }
            };

            $.fn.zTree.init($('#' + targetId + '-treeview'), settings, treeDataRaw);
        };

        if (opts.sourceUrl) {
            new eb.Client({
                url: eb.settings.SERVER_CONTEXT_PATH + opts.sourceUrl,
                requestData: opts.requestData
            }).ifSuccess(function (response) {
                initTreeView(response.data);
            }).send();
        } else {
            initTreeView(opts.treeData);
        }
    }

};

/***/ }),
/* 20 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


var _jquery = __webpack_require__(0);

var _jquery2 = _interopRequireDefault(_jquery);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { 'default': obj }; }

var DataGrid = {

    lib: {},

    DEFAULTS: {},

    call: function call(target, param1, param2) {
        var method = void 0,
            methodName = void 0,
            options = void 0,
            implType = target.attr('data-use') || 'bootstrap-table';

        if (typeof param1 === 'string') {
            methodName = param1;
            options = param2 || {};
        } else {
            methodName = 'init';
            options = param1 || {};
        }

        method = (eb.component.DataGrid.lib[implType] ? eb.component.DataGrid.lib[implType][methodName] : null) || eb.component.DataGrid[methodName];

        if (method) {
            return method(target, options);
        }

        eb.log.error('DataGrid cannot found method \'' + methodName + '\' for ' + target.id + '!');
    },

    init: function init(target, options) {
        options = options || {};

        // 分页策略：none、pseudo、real
        var pageStrategy = options.pageStrategy || target.attr("data-page-strategy") || 'real';

        // 选择策略：none、single、multi
        var selectStrategy = options.selectStrategy || target.attr('data-select-strategy') || 'none';

        // 绑定搜索表单
        var searchFormId = options.searchFormId || target.attr('data-searchform-id') || false;

        var dataGridId = target.attr("id");

        var columns = [];

        if (selectStrategy && selectStrategy !== 'none' && selectStrategy !== 'false') {
            columns.push({
                //field: 'field1',
                checkbox: selectStrategy === 'multi',
                radio: selectStrategy === 'single',
                align: 'center',
                valign: 'middle'
            });
        }

        for (var i = 0; i < options.columns.length; i++) {
            var columnRaw = options.columns[i];
            var column = {};
            if (columnRaw.title) column.title = columnRaw.title;
            if (columnRaw.field) column.field = columnRaw.field;
            if (columnRaw.dict || columnRaw.dictName) {
                (function () {
                    var dict = columnRaw.dictName ? eb.app.cache.dicts[columnRaw.dictName] || [] : columnRaw.dict;

                    column.formatter = function (value, row, index) {
                        if (value) {
                            var pieces = value.split(eb.settings.MUTI_VAL_SEP);
                            var finalPieces = [];
                            for (var _i = 0; _i < pieces.length; _i++) {
                                for (var j = 0; j < dict.length; j++) {
                                    if (dict[j].key === pieces[_i]) {
                                        finalPieces.push(dict[j].value);
                                        break;
                                    }
                                }
                            }
                            return finalPieces.join(eb.settings.MUTI_VAL_SEP);
                        }

                        return '';
                    };
                })();
            }
            if (columnRaw.actions) {
                (function () {
                    var actions = columnRaw.actions;
                    column.formatter = function (value, row, index) {
                        var html = "";
                        for (var _i2 = 0; _i2 < actions.length; _i2++) {
                            var action = actions[_i2];
                            var actionStr = action.action;

                            var arr = actionStr.match(/@\{[A-Za-z_]+\}/g);
                            if (arr) {
                                for (var j = 0; j < arr.length; j++) {
                                    var columnName = arr[j].substr(2, arr[j].length - 3);

                                    /*if (columnName=="DATAINDEX")
                                    {
                                        var regStr = "\@\{" + columnName + "\}";
                                        var reg = new RegExp(regStr, "g");
                                         value = value.replace(reg, (column.value==null ? "" : index));
                                    }
                                    else if (row[columnName] || row[columnName]==null || row[columnName]==0)
                                    {*/

                                    actionStr = actionStr.replace(/\@\{DATAINDEX\}/, index);

                                    var regStr = "\@\{" + columnName + "\}";
                                    var reg = new RegExp(regStr, "g");

                                    actionStr = actionStr.replace(reg, row[columnName] == null ? "" : row[columnName]);
                                    /*}*/
                                }
                            }

                            html += "<a class=\"action-link " + action.icon + "\" href=\"#\" data-action=\"" + actionStr + "\" title=\"" + (action.remark ? action.remark : '') + "\">" + action.name + "</a>";
                        }

                        return html;
                    };
                })();
            }

            columns.push(column);
        }
        options.columns;

        var opts = {
            columns: columns,
            method: "post",
            ajaxOptions: {
                contentType: "application/json"
            },
            dataType: "json",
            undefinedText: "-",
            onCheck: function onCheck(row, $element) {
                var func = target.data('onCheck');
                if (func) {
                    func(row, $element.parent().parent().attr('data-index'));
                }
            },
            onUncheck: function onUncheck(row, $element) {
                var func = target.data('onUncheck');
                if (func) {
                    func(row, $element.parent().parent().attr('data-index'));
                }
            },
            onCheckAll: function onCheckAll(rows) {
                var func = target.data('onCheckAll');
                if (func) {
                    func(rows);
                }
            },
            onUncheckAll: function onUncheckAll(rows) {
                var func = target.data('onUncheckAll');
                if (func) {
                    func(rows);
                }
            }
        };

        if (selectStrategy === 'single') {
            opts.radio = true;
        } else if (selectStrategy === 'multi') {
            opts.checkbox = true;
        }

        if (options.data || options.value) {
            opts.data = options.data || options.value;
        }

        opts.url = options.sourceUrl || target.attr("data-source-url");

        switch (pageStrategy) {
            case 'real':
                opts.sidePagination = 'server';
                opts.pagination = true;
                opts.queryParams = function (params) {
                    var query = options.requestData || {};
                    var curOpts = (0, _jquery2['default'])("#" + dataGridId).bootstrapTable("getOptions");

                    var formId = searchFormId;
                    if (formId) {
                        query = eb.utils.form.extractAsObjects(formId, true);
                    }

                    query.page = {
                        pageSize: curOpts.pageSize || 10,
                        pageNumber: params.pageNumber || curOpts.pageNumber || 1
                    };

                    return query;
                };

                opts.responseHandler = function (response) {
                    if (response.flag === 0 || response.result === 0) // FIXME
                        {
                            var responseData = response.resultData || response.data;

                            return {
                                rows: responseData.dataList,
                                pageNumber: responseData.page.pageNumber,
                                total: responseData.page.totalRecord
                            };
                        }
                };

                break;
            case 'pseudo':
                opts.pagination = true;
                opts.queryParams = function (params) {
                    var query = options.requestData || {};

                    var formId = searchFormId;
                    if (formId) {
                        query = eb.utils.form.extractAsObjects(formId, true);
                    }

                    return query;
                };

                opts.responseHandler = function (response) {
                    if (response.flag === 0 || response.result === 0) // FIXME
                        {
                            var responseData = response.resultData || response.data;

                            return responseData.dataList;
                        }
                };

                break;
            case 'none':
            default:

                opts.pagination = false;
                opts.queryParams = function (params) {
                    var query = options.requestData || {};

                    var formId = searchFormId;
                    if (formId) {
                        query = eb.utils.form.extractAsObjects(formId, true);
                    }

                    return query;
                };

                opts.responseHandler = function (response) {
                    if (response.flag === 0 || response.result === 0) // FIXME
                        {
                            var responseData = response.resultData || response.data;

                            return responseData.dataList;
                        }
                };

                break;
        };

        target.bootstrapTable(opts);
    },

    search: function search(target, options) {
        // 分页策略：none、pseudo、real
        var pageStrategy = options.pageStrategy || target.attr("data-page-strategy") || 'real';

        var curOpts = target.bootstrapTable("getOptions");

        var query = {};
        if (options.searchData) query.params = options.searchData;

        /*switch (pageStrategy)
        {
            case "real":
                /!*options.page = {
                    curPageNum: 1,
                    pageSize: curOpts.pageSize
                }*!/
                break;
        };*/

        target.bootstrapTable("refresh", {
            pageNumber: 1
        });
    },

    getData: function getData(target, options) {
        return target.bootstrapTable('getData');
    },

    setData: function setData(target, options) {
        target.bootstrapTable('load', options.items || []);
    },

    updateItem: function updateItem(target, options) {
        var index = options.index;
        var item = options.item;
        var data = target.bootstrapTable('getData');
        data[index] = item;
        target.bootstrapTable('load', data);
    },

    addData: function addData(target, options) {
        var data = target.bootstrapTable('getData');
        if (options.item) {
            data.push(options.item);
        }
        if (options.items) {
            for (var i = 0; i < options.items.length; i++) {
                data.push(options.items[i]);
            }
        }
        target.bootstrapTable('load', data);
    },

    delData: function delData(target, options) {
        var index = options.index;
        var data = target.bootstrapTable('getData');
        var newData = [];
        for (var i = 0; i < data.length; i++) {
            if (i !== index) newData.push(data[i]);
        }
        target.bootstrapTable('load', newData);
    },

    getSelections: function getSelections(target, options) {
        return target.bootstrapTable('getSelections');
    },

    onCheck: function onCheck(target, func) {
        target.data('onCheck', func);
    },

    onUncheck: function onUncheck(target, func) {
        target.data('onUncheck', func);
    },

    onCheckAll: function onCheckAll(target, func) {
        target.data('onCheckAll', func);
    },

    onUncheckAll: function onUncheckAll(target, func) {
        target.data('onUncheckAll', func);
    }
};

module.exports = DataGrid;

/***/ }),
/* 21 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


var RichInput = {

    // 输入组件实现
    lib: {
        'text': __webpack_require__(16),

        'password': __webpack_require__(13),

        'select': __webpack_require__(15),

        'multiselect': __webpack_require__(12),

        'timepicker': __webpack_require__(18),

        'checkbox': __webpack_require__(10),

        'radio': __webpack_require__(14),

        'textarea': __webpack_require__(17),

        'lookup': __webpack_require__(11),

        'tree': __webpack_require__(19)
    },

    // 默认参数
    DEFAULTS: {},

    call: function call(target, param1, param2) {
        var method = void 0,
            methodName = void 0,
            options = void 0,
            iptType = target.attr('data-eb-type');

        if (typeof param1 === 'string') {
            methodName = param1;
            options = param2 || {};
        } else {
            methodName = 'init';
            options = param1 || {};
        }

        method = (eb.component.RichInput.lib[iptType] ? eb.component.RichInput.lib[iptType][methodName] : null) || eb.component.RichInput[methodName];

        if (method) {
            return method(target, options);
        }

        eb.log.error('RichInput cannot found method \'' + methodName + '\' for ' + target.attr('id') + '!');
    },

    /**
     * 触发校验
     * @param target
     * @param options
     */
    triggerValidation: function triggerValidation(target, options) {
        var result = eb.component.RichInput.validate(target, options);
        var showResult = typeof options.showResult !== 'undefined' ? options.showResult : true;

        eb.component.RichInput.call(target, 'setValidationResult', {
            result: result
        });

        if (showResult) eb.component.RichInput.call(target, 'showValidationResult');
    },

    /**
     * 组件校验
     * @param target
     * @param options
     * @returns {*}
     */
    validate: function validate(target, options) {
        var value = eb.component.RichInput.call(target, 'getValue');

        // 必输校验
        if (target.attr('data-required') === 'true' && !value) {
            return "必填";
        }

        // 正则校验
        var regName = target.attr('data-reg');
        if (regName || value === '') {
            var regItem = eb.utils.regs[regName];
            if (regItem) {
                var reg = regItem.reg;
                if (!reg.test(value)) {
                    return regItem.msg;
                }
            }
        }

        // TODO 更多校验方式

        return "passed";
    }
};

module.exports = RichInput;

/***/ }),
/* 22 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


var components = {

    RichInput: __webpack_require__(21),

    DataGrid: __webpack_require__(20),

    /**
     * 保存组件选项
     * @param target
     * @param options
     */
    saveOptions: function saveOptions(target, options) {
        target.data('eb-opts', options);
    },

    /**
     * 获取组件选项
     * @param target
     */
    getOptions: function getOptions(target) {
        return target.data('eb-opts');
    }

};

module.exports = components;

/***/ }),
/* 23 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


var crypto = {

    encrypt: function encrypt(argorithm, msgStr) {
        var hexcase = 0;
        var b64pad = "";
        var chrsz = 8;

        var binl2hex = function binl2hex(binarray) {
            var hex_tab = hexcase ? "0123456789ABCDEF" : "0123456789abcdef";
            var str = "";
            for (var i = 0; i < binarray.length * 4; i++) {
                str += hex_tab.charAt(binarray[i >> 2] >> i % 4 * 8 + 4 & 0xF) + hex_tab.charAt(binarray[i >> 2] >> i % 4 * 8 & 0xF);
            }
            return str;
        };

        var str2binl = function str2binl(str) {
            var bin = Array();
            var mask = (1 << chrsz) - 1;
            for (var i = 0; i < str.length * chrsz; i += chrsz) {
                bin[i >> 5] |= (str.charCodeAt(i / chrsz) & mask) << i % 32;
            }return bin;
        };

        var bit_rol = function bit_rol(num, cnt) {
            return num << cnt | num >>> 32 - cnt;
        };

        var safe_add = function safe_add(x, y) {
            var lsw = (x & 0xFFFF) + (y & 0xFFFF);
            var msw = (x >> 16) + (y >> 16) + (lsw >> 16);
            return msw << 16 | lsw & 0xFFFF;
        };

        switch (argorithm.toLowerCase()) {
            case "md5":
                var md5_cmn = function md5_cmn(q, a, b, x, s, t) {
                    return safe_add(bit_rol(safe_add(safe_add(a, q), safe_add(x, t)), s), b);
                };
                var md5_ff = function md5_ff(a, b, c, d, x, s, t) {
                    return md5_cmn(b & c | ~b & d, a, b, x, s, t);
                };
                var md5_gg = function md5_gg(a, b, c, d, x, s, t) {
                    return md5_cmn(b & d | c & ~d, a, b, x, s, t);
                };
                var md5_hh = function md5_hh(a, b, c, d, x, s, t) {
                    return md5_cmn(b ^ c ^ d, a, b, x, s, t);
                };
                var md5_ii = function md5_ii(a, b, c, d, x, s, t) {
                    return md5_cmn(c ^ (b | ~d), a, b, x, s, t);
                };

                var core_md5 = function core_md5(x, len) {
                    /* append padding */
                    x[len >> 5] |= 0x80 << len % 32;
                    x[(len + 64 >>> 9 << 4) + 14] = len;

                    var a = 1732584193;
                    var b = -271733879;
                    var c = -1732584194;
                    var d = 271733878;

                    for (var i = 0; i < x.length; i += 16) {
                        var olda = a;
                        var oldb = b;
                        var oldc = c;
                        var oldd = d;

                        a = md5_ff(a, b, c, d, x[i + 0], 7, -680876936);
                        d = md5_ff(d, a, b, c, x[i + 1], 12, -389564586);
                        c = md5_ff(c, d, a, b, x[i + 2], 17, 606105819);
                        b = md5_ff(b, c, d, a, x[i + 3], 22, -1044525330);
                        a = md5_ff(a, b, c, d, x[i + 4], 7, -176418897);
                        d = md5_ff(d, a, b, c, x[i + 5], 12, 1200080426);
                        c = md5_ff(c, d, a, b, x[i + 6], 17, -1473231341);
                        b = md5_ff(b, c, d, a, x[i + 7], 22, -45705983);
                        a = md5_ff(a, b, c, d, x[i + 8], 7, 1770035416);
                        d = md5_ff(d, a, b, c, x[i + 9], 12, -1958414417);
                        c = md5_ff(c, d, a, b, x[i + 10], 17, -42063);
                        b = md5_ff(b, c, d, a, x[i + 11], 22, -1990404162);
                        a = md5_ff(a, b, c, d, x[i + 12], 7, 1804603682);
                        d = md5_ff(d, a, b, c, x[i + 13], 12, -40341101);
                        c = md5_ff(c, d, a, b, x[i + 14], 17, -1502002290);
                        b = md5_ff(b, c, d, a, x[i + 15], 22, 1236535329);

                        a = md5_gg(a, b, c, d, x[i + 1], 5, -165796510);
                        d = md5_gg(d, a, b, c, x[i + 6], 9, -1069501632);
                        c = md5_gg(c, d, a, b, x[i + 11], 14, 643717713);
                        b = md5_gg(b, c, d, a, x[i + 0], 20, -373897302);
                        a = md5_gg(a, b, c, d, x[i + 5], 5, -701558691);
                        d = md5_gg(d, a, b, c, x[i + 10], 9, 38016083);
                        c = md5_gg(c, d, a, b, x[i + 15], 14, -660478335);
                        b = md5_gg(b, c, d, a, x[i + 4], 20, -405537848);
                        a = md5_gg(a, b, c, d, x[i + 9], 5, 568446438);
                        d = md5_gg(d, a, b, c, x[i + 14], 9, -1019803690);
                        c = md5_gg(c, d, a, b, x[i + 3], 14, -187363961);
                        b = md5_gg(b, c, d, a, x[i + 8], 20, 1163531501);
                        a = md5_gg(a, b, c, d, x[i + 13], 5, -1444681467);
                        d = md5_gg(d, a, b, c, x[i + 2], 9, -51403784);
                        c = md5_gg(c, d, a, b, x[i + 7], 14, 1735328473);
                        b = md5_gg(b, c, d, a, x[i + 12], 20, -1926607734);

                        a = md5_hh(a, b, c, d, x[i + 5], 4, -378558);
                        d = md5_hh(d, a, b, c, x[i + 8], 11, -2022574463);
                        c = md5_hh(c, d, a, b, x[i + 11], 16, 1839030562);
                        b = md5_hh(b, c, d, a, x[i + 14], 23, -35309556);
                        a = md5_hh(a, b, c, d, x[i + 1], 4, -1530992060);
                        d = md5_hh(d, a, b, c, x[i + 4], 11, 1272893353);
                        c = md5_hh(c, d, a, b, x[i + 7], 16, -155497632);
                        b = md5_hh(b, c, d, a, x[i + 10], 23, -1094730640);
                        a = md5_hh(a, b, c, d, x[i + 13], 4, 681279174);
                        d = md5_hh(d, a, b, c, x[i + 0], 11, -358537222);
                        c = md5_hh(c, d, a, b, x[i + 3], 16, -722521979);
                        b = md5_hh(b, c, d, a, x[i + 6], 23, 76029189);
                        a = md5_hh(a, b, c, d, x[i + 9], 4, -640364487);
                        d = md5_hh(d, a, b, c, x[i + 12], 11, -421815835);
                        c = md5_hh(c, d, a, b, x[i + 15], 16, 530742520);
                        b = md5_hh(b, c, d, a, x[i + 2], 23, -995338651);

                        a = md5_ii(a, b, c, d, x[i + 0], 6, -198630844);
                        d = md5_ii(d, a, b, c, x[i + 7], 10, 1126891415);
                        c = md5_ii(c, d, a, b, x[i + 14], 15, -1416354905);
                        b = md5_ii(b, c, d, a, x[i + 5], 21, -57434055);
                        a = md5_ii(a, b, c, d, x[i + 12], 6, 1700485571);
                        d = md5_ii(d, a, b, c, x[i + 3], 10, -1894986606);
                        c = md5_ii(c, d, a, b, x[i + 10], 15, -1051523);
                        b = md5_ii(b, c, d, a, x[i + 1], 21, -2054922799);
                        a = md5_ii(a, b, c, d, x[i + 8], 6, 1873313359);
                        d = md5_ii(d, a, b, c, x[i + 15], 10, -30611744);
                        c = md5_ii(c, d, a, b, x[i + 6], 15, -1560198380);
                        b = md5_ii(b, c, d, a, x[i + 13], 21, 1309151649);
                        a = md5_ii(a, b, c, d, x[i + 4], 6, -145523070);
                        d = md5_ii(d, a, b, c, x[i + 11], 10, -1120210379);
                        c = md5_ii(c, d, a, b, x[i + 2], 15, 718787259);
                        b = md5_ii(b, c, d, a, x[i + 9], 21, -343485551);

                        a = safe_add(a, olda);
                        b = safe_add(b, oldb);
                        c = safe_add(c, oldc);
                        d = safe_add(d, oldd);
                    }
                    return Array(a, b, c, d);
                };

                return binl2hex(core_md5(str2binl(msgStr), msgStr.length * chrsz));
                break;
        };
    }

};

module.exports = crypto;

/***/ }),
/* 24 */
/***/ (function(module, exports, __webpack_require__) {

"use strict";


Date.prototype.format = function (fmt) {
    var o = {
        "M+": this.getMonth() + 1, //月份
        "d+": this.getDate(), //日
        "h+": this.getHours(), //小时
        "m+": this.getMinutes(), //分
        "s+": this.getSeconds(), //秒
        "q+": Math.floor((this.getMonth() + 3) / 3), //季度
        "S": this.getMilliseconds //毫秒
        () };
    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o) {
        if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ("00" + o[k]).substr(("" + o[k]).length));
    }return fmt;
};

var levels = {
    'DEBUG': { 'levelNum': 0, 'color': '#999999', 'background': 'white' },
    'INFO': { 'levelNum': 1, 'color': '#31708f', 'background': '#d9edf7' },
    'WARN': { 'levelNum': 2, 'color': '#8a6d3b', 'background': '#fcf8e3' },
    'ERROR': { 'levelNum': 3, 'color': '#a94442', 'background': '#f2dede' }
};

var Printer = function Printer(levelName) {
    var level = levels[levelName];

    return function (msg) {
        var logLevelName = eb.settings.LOG_LEVEL || 'DEBUG';
        var sysLogLevel = levels[logLevelName];

        if (level.levelNum < sysLogLevel.levelNum) return;

        if (window.console) {
            var msgStr = '[' + levelName + '] [' + new Date().format('yyyy-MM-dd hh:mm:ss.S') + '] ' + msg;

            /*if (eb.settings.BROWSER.browser === 'IE')
            {*/
            console.log(msgStr);
            /*}
            else
            {
                console.log('%c' + finalMsgStr, 'color: ' + level.color + '; background: ' + level.background);
            }*/
        }
    };
};

var log = {
    debug: Printer('DEBUG'),

    info: Printer('INFO'),

    warn: Printer('WARN'),

    error: Printer('ERROR')
};

module.exports = log;

/***/ }),
/* 25 */
/***/ (function(module, exports) {

/*! http://mths.be/endswith v0.2.0 by @mathias */
if (!String.prototype.endsWith) {
	(function() {
		'use strict'; // needed to support `apply`/`call` with `undefined`/`null`
		var defineProperty = (function() {
			// IE 8 only supports `Object.defineProperty` on DOM elements
			try {
				var object = {};
				var $defineProperty = Object.defineProperty;
				var result = $defineProperty(object, object, object) && $defineProperty;
			} catch(error) {}
			return result;
		}());
		var toString = {}.toString;
		var endsWith = function(search) {
			if (this == null) {
				throw TypeError();
			}
			var string = String(this);
			if (search && toString.call(search) == '[object RegExp]') {
				throw TypeError();
			}
			var stringLength = string.length;
			var searchString = String(search);
			var searchLength = searchString.length;
			var pos = stringLength;
			if (arguments.length > 1) {
				var position = arguments[1];
				if (position !== undefined) {
					// `ToInteger`
					pos = position ? Number(position) : 0;
					if (pos != pos) { // better `isNaN`
						pos = 0;
					}
				}
			}
			var end = Math.min(Math.max(pos, 0), stringLength);
			var start = end - searchLength;
			if (start < 0) {
				return false;
			}
			var index = -1;
			while (++index < searchLength) {
				if (string.charCodeAt(start + index) != searchString.charCodeAt(index)) {
					return false;
				}
			}
			return true;
		};
		if (defineProperty) {
			defineProperty(String.prototype, 'endsWith', {
				'value': endsWith,
				'configurable': true,
				'writable': true
			});
		} else {
			String.prototype.endsWith = endsWith;
		}
	}());
}


/***/ }),
/* 26 */
/***/ (function(module, exports) {

/*! http://mths.be/startswith v0.2.0 by @mathias */
if (!String.prototype.startsWith) {
	(function() {
		'use strict'; // needed to support `apply`/`call` with `undefined`/`null`
		var defineProperty = (function() {
			// IE 8 only supports `Object.defineProperty` on DOM elements
			try {
				var object = {};
				var $defineProperty = Object.defineProperty;
				var result = $defineProperty(object, object, object) && $defineProperty;
			} catch(error) {}
			return result;
		}());
		var toString = {}.toString;
		var startsWith = function(search) {
			if (this == null) {
				throw TypeError();
			}
			var string = String(this);
			if (search && toString.call(search) == '[object RegExp]') {
				throw TypeError();
			}
			var stringLength = string.length;
			var searchString = String(search);
			var searchLength = searchString.length;
			var position = arguments.length > 1 ? arguments[1] : undefined;
			// `ToInteger`
			var pos = position ? Number(position) : 0;
			if (pos != pos) { // better `isNaN`
				pos = 0;
			}
			var start = Math.min(Math.max(pos, 0), stringLength);
			// Avoid the `indexOf` call if no match is possible
			if (searchLength + start > stringLength) {
				return false;
			}
			var index = -1;
			while (++index < searchLength) {
				if (string.charCodeAt(start + index) != searchString.charCodeAt(index)) {
					return false;
				}
			}
			return true;
		};
		if (defineProperty) {
			defineProperty(String.prototype, 'startsWith', {
				'value': startsWith,
				'configurable': true,
				'writable': true
			});
		} else {
			String.prototype.startsWith = startsWith;
		}
	}());
}


/***/ }),
/* 27 */
/***/ (function(module, exports) {

module.exports = template;

/***/ }),
/* 28 */,
/* 29 */,
/* 30 */,
/* 31 */
/***/ (function(module, exports, __webpack_require__) {

__webpack_require__(4);
__webpack_require__(3);
__webpack_require__(2);

// 框架主题
__webpack_require__(5);

// 框架函数库
eb = __webpack_require__(1);

eb.app =
{
    config:
    {
        DEFAULT_METHOD: "POST"
    }
};

/***/ })
/******/ ]);