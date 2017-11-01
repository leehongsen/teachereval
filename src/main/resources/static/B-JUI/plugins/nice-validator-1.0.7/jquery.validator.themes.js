/* ========================================================================
 * for nice validate themes
 * @since K'naan (xknaan@163.com)
 * ======================================================================== */

+function ($) {
    'use strict';

    function fixedLeft($msgbox) {
        var $input    = $msgbox.prev(),
            $btngroup = $msgbox.next(),
            $icheck   = $msgbox.closest('[data-icheck]'),
            $ichecks  = $icheck.siblings('[data-icheck="'+ $icheck.data('icheck') +'"]').andSelf(),
            $upload   = $msgbox.closest('.bjui-upload')
            
        var offLeft = 0
        
        if (($input && $input.isTag('select') && $input.is(':hidden')) && ($btngroup && $btngroup.hasClass('bootstrap-select'))) {
            var $btngroup = $msgbox.next()
            
            offLeft += $btngroup.outerWidth()
        }
        if ($icheck.length) {
            $ichecks.each(function() {
                offLeft += $(this).outerWidth()
            })
            $msgbox.children().css('top', -4)
        }
        if ($upload.length) {
            offLeft += $upload.find('.bjui-upload-select').outerWidth()
        }
        
        return offLeft
    }
    
    var TPL_ARROW = '<span class="n-arrow"><b>◆</b><i>◆</i></span>';
    
    $.validator.setTheme({
        'simple_right': {
            formClass: 'n-simple',
            msgClass: 'n-right'
        },
        'simple_bottom': {
            formClass: 'n-simple',
            msgClass: 'n-bottom'
        },
        'yellow_top': {
            formClass: 'n-yellow',
            msgClass: 'n-top',
            msgArrow: TPL_ARROW
        },
        'yellow_right': {
            formClass: 'n-yellow',
            msgClass: 'n-right',
            msgArrow: TPL_ARROW
        },
        'yellow_right_effect': {
            formClass: 'n-yellow',
            msgClass: 'n-right',
            msgArrow: TPL_ARROW,
            msgShow: function($msgbox, type){
                var $el = $msgbox.children();
                if ($el.is(':animated')) return;
                if (type === 'error') {
                    $el.css({left: '20px', opacity: 0})
                        .delay(100).show().stop()
                        .animate({left: '-4px', opacity: 1}, 150)
                        .animate({left: '3px'}, 80)
                        .animate({left: 0}, 80);
                } else {
                    $el.css({left: 0, opacity: 1}).fadeIn(200);
                }
            },
            msgHide: function($msgbox, type){
                var $el = $msgbox.children();
                $el.stop().delay(100).show()
                    .animate({left: '20px', opacity: 0}, 300, function(){
                        $msgbox.hide();
                    });
            }
        },
        'red_bottom_effect_grid': {
            formClass: 'n-red',
            msgClass: 'n-bottom',
            msgArrow: TPL_ARROW,
            msgShow: function($msgbox, type) {
                var $el   = $msgbox.children(),
                    offLeft = 0,
                    $wrap   = $msgbox.find('> .msg-wrap'),
                    $icon   = $msgbox.find('.n-icon')
                
                if ($wrap.hasClass('n-error'))
                    $icon.removeClass('n-icon').addClass('glyphicon glyphicon-remove-circle').css({top:-1, 'font-size':'14px', 'vertical-align':'middle'})
                else if ($wrap.hasClass('n-tip'))
                    $icon.removeClass('n-icon').addClass('glyphicon glyphicon-info-sign').css({top:-1, 'font-size':'14px', 'vertical-align':'middle'})
                else if ($wrap.hasClass('n-ok'))
                    $icon.removeClass('n-icon').addClass('glyphicon glyphicon-ok-circle').css({top:-1, 'font-size':'14px', 'vertical-align':'middle'})
                if ($el.is(':animated')) return
                if (type === 'error') {
                    $el.css({
                        left: offLeft + 20,
                        opacity: 0
                    }).delay(100).show().stop().animate({
                        left: offLeft - 4,
                        opacity: 1
                    }, 150).animate({
                        left: offLeft + 3
                    }, 80).animate({
                        left: offLeft
                    }, 80)
                } else {
                    $el.css({
                        left: offLeft,
                        opacity: 1
                    }).fadeIn(200)
                }
            },
            msgHide: function($msgbox, type) {
                var $el = $msgbox.children()
                
                $el.stop().delay(100).show().animate({
                    left: '20px',
                    opacity: 0
                }, 300, function(){
                    $msgbox.hide()
                })
            }
        }
    })
    
    
    $.validator.config({
        theme     : 'red_bottom_effect_grid',
        formClass : 'n-red'
    })
    
}(jQuery);