select t.dummy,  xmlcast(xmlquery('fn:replace($v,"[^\d]", "" )' PASSING t.dummy as "v" ) as varchar(150))
from dual t