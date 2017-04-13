select  replace(
                replace(
                        replace(
                                replace(
                                        replace(
                                                replace(
                                                        replace(
                                                                replace(
                                                                        replace(
        replace(
                replace(
                        replace(
                                replace(
                                        replace(
                                                replace(
                                                        replace(
                                                                replace(
                                                                        replace(
                                                                                translate(replace(replace('Я твой макрос линковал', 'КС','X'), 'кс','x'),
                                                                                          'АБВГДЕЗИЙКЛМНОПРСТУФХЫЪЬабвгдезийклмнопрстуфхыъь',
                                                                                          'ABVGDEZIYKLMNOPRSTUFHY#'||chr(39)||'abvgdeziyklmnoprstufhy#'||chr(39)
                                                                                         )
                                                                                ,'Ж','ZH')
                                                                        ,'Ё','YO')
                                                                ,'Ц','TS')
                                                        ,'Ч','CH')
                                                ,'Ш','SH')
                                        ,'Щ','SCH')
                                ,'Э','EH')
                        ,'Ю','YU')
                ,'Я','YA')
                                                                                  ,'ж','zh')
                                                                          ,'ё','yo')
                                                                  ,'ц','ts')
                                                          ,'ч','ch')
                                                  ,'ш','sh')
                                        ,'щ','sch')
                                ,'э','eh')
                        ,'ю','yu')
                ,'я','ya')
        
from dual;