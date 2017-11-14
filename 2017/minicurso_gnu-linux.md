# Que bicho é esse? Conhecendo o GNU/Linux

É comum encontrarmos pessoas que já ouviram falar do Software Livre, simpatizam com a ideia, mas nunca tiveram a oportunidade de iniciar a utilização de um sistema GNU/Linux. Há ainda aqueles que iniciam a utilização por iniciativa própria mas nunca receberam uma orientação sobre o funcionamento deste sistema.
Foi pensando nisso que criamos este minicurso, queremos que você comece a utilizar o sistema com o pé direito! O objetivo é apresentar o sistema desde a instalação até sua utilização diária, dando dicas de comandos e ferramentas que podem ser úteis para resolver dúvidas e problemas do dia a dia.


## Referências

Por ser um projeto que na sua época de lançamento quebrou paradigmas, o GNU/Linux é amado por muitos e odiado por tantos outros. Justamente por ter despertado paixões e ter formado as bases do que é hoje a internet é que sua história está documentada em inúmeras páginas e materiais da rede.
Não querendo reescrever a roda, procurei estruturar esse minicurso com base em alguns materiais de referência, na intenção de permitir aos alunos uma continuidade de aprendizado.

As referências utilizadas foram:
- [Free Software Foundation](http://www.fsf.org/)
- [Wiki Debian](http://wiki.debian.org/)
- [Guia FOCA](http://www.guiafoca.org/)
- [Linux.org](http://www.linux.org/)

_"Se vi mais longe foi por estar de pé sobre ombros de gigantes."_ Isaac Newton



## Introdução ao Sofware Livre

A história começa na década de 70 quando Richard Stallman trabalhava no MIT. Nesta época era comum que todo software fosse Software Livre, até empresas distribuíam Software Livre e os programadores cooperavam uns com os outros frequentemente. Mas na década de 80 houve uma mudança drástica no mercado e todo o software passou a ser proprietário, impedindo que usuários modificassem suas versões. Era preciso assinar um termo de confidencialidade até mesmo para obter os executáveis dos programas!

Isto significava que o primeiro passo para usar um computador era prometer não ajudar o seu próximo. Uma comunidade cooperativa era proibida. A regra definida pelos donos do software privativo era, “Se você compartilha com seu próximo, você é um pirata. Se você quer alterações, suplique-nos para fazê-las”.

A ideia de que o sistema social do software privativo é antissocial, antiético ou simplesmente errado, pode vir como uma surpresa para alguns. Mas o que mais poderíamos dizer sobre um sistema baseado na divisão e impotência dos usuários?

É com esta preocupação moral e ética que Richard Stallman opta por criar um movimento social que visa quebrar com as barreiras impostas pelo software proprietário. Sua comunidade eram todos os seus amigos hackers com quem havia aprendido e compartilhado muito conhecimento, como não pensar neles? Partindo deste ponto e analisando suas habilidades pessoais é que Stallman decide que a melhor contribuição que ele poderia dar é escrevendo um Sistema Operacional livre, mas não seria uma decisão fácil. Desenvolver um sistema inteiro é um projeto muito grande, para torná-lo viável ele decide adaptar e usar peças existentes de Software Livre onde fosse possível.

Em janeiro de 1984 Stallman deixa o MIT e começa a desenvolver o GNU, o nome fora escolhido por ser um acrônimo recursivo para "GNU Não é Unix". O trabalho começou com o editor de textos GNU Emacs, que foi a primeira fonte de renda do projeto vendido a U$150,00 a cópia completa. Em 1985 é fundada a Free Software Foundation, uma entidade sem fins lucrativos destinada a promover e desenvolver o Software Livre.


## Devemos falar sobre liberdade

As estimativas atuais são de que existem dez milhões de usuários do sistemas GNU/Linux, como Debian GNU/Linux e Red Hat “Linux”. O software livre tem desenvolvido tamanhas vantagens práticas que os usuários estão migrando para ele por razões puramente práticas.

As boas consequências disto são evidentes: mais interesse no desenvolvimento do software livre, mais clientes para as empresas do software livre, e mais capacidade de incentivar as empresas a desenvolver software livre comercial, em vez de produtos de software privativo.

Mas o interesse no software está crescendo mais rápido do que a consciência na filosofia sobre a qual ele se baseia, e isso leva a problemas. A nossa capacidade para enfrentar os desafios e ameaças descritas acima depende da vontade de defender firmemente a liberdade. Para nos certificarmos de que nossa comunidade tem essa vontade, precisamos difundir a ideia para os novos usuários conforme eles chegam à nossa comunidade, precisamos ensiná-los a educação cívica da nossa comunidade.

A filosofia do software livre rejeita uma prática específica e amplamente difundida de negócios, mas não é contra os negócios. Quando as empresas respeitam a liberdade dos usuários, desejamos-lhes sucesso. Mas há uma outra parcela de empresários e executivos que colocam o lucro acima da liberdade, da comunidade e dos princípios.

A venda de cópias do Emacs demonstra um tipo de negócio com Software Livre. A FSF é uma entidade que também precisa de sustentabilidade econômica e o faz vendendo serviços e até outras fontes de renda. No entanto, algumas empresas se associam ao termpo Código Aberto (Open Source) e apresentam uma proposta que na verdade é privativa pois seus produtos não respeitam a liberdade do usuário.


## O Sistema GNU/Linux

O Sistema Operacional é o conjunto de programas que fazem a interface do usuário e de seus programas com o computador. Ele é responsável pelo gerenciamento de recursos e periféricos (como memória, discos, arquivos, impressoras, CD-ROMs, etc.), interpretação de mensagens e pela execução de programas.

![Dispositivos](dispositivos.png)

O núcleo do sistema (kernel) vem do projeto Linux e o conjunto de ferramentas que compõem o Sistema Operacional vem do projeto GNU, por isso, o nome do sistema é GNU/Linux.

O GNU/Linux é um sistema operacional criado em 1991 por Linus Torvalds. É um sistema Operacional de código aberto distribuído gratuitamente pela Internet. Seu código fonte é liberado como Software Livre, sob licença GPL, o aviso de copyright do kernel feito por Linus descreve detalhadamente isto e mesmo ele não pode fechar o sistema para que seja usado apenas comercialmente.

Isto quer dizer que você não precisa pagar nada para usar o GNU/Linux, e não é crime fazer cópias para instalar em outros computadores, nós inclusive incentivamos você a fazer isto!


### Distribuições

Existem diferentes versões do GNU/Linux e diferente de Sistemas proprietários controlados por uma única companhia o GNU/Linux é Software Livre que pode ser copiado, alterado e redistribuído sem qualquer problema. Isso cria uma situação onde diversas companhias, organizações e indivíduos têm desenvolvido sua própria e específica versão do sistema. Quando estas versões são oferecidas publicamente como Software Livre, elas são chamadas de distribuições.

Normalmente distribuições são criadas para atender propósitos específicos. Há versões desenvolvidas especificamene para rodarem em servidores que trabalham com tráfego pesado, outras versões para trabalhar em dispositivos de rede como roteadores e firewalls, versões mais recentes criadas para rodarem na nuvem e containers, ou em dispositivos móveis e embarcados como celulares, gps e equipamentos eletrônicos inteligentes, e claro há versões desenvolvidas para rodar em computadores pessoais como notebooks e desktops.

Por se tratar de um curso introdutório vamos abordar especificamente as distribuições para computadores pessoais, mas nada impede que conhecimentos aqui aprendidos sejam usados em outras plataformas.


### Como escolher sua distribuição?

Devido a grande variedade, o grande dilema de um usuário iniciante é sempre escolher qual distribuição usar. Existem usuários que têm maior afinidade com o computador e muitos outros esperam apenas que o equipamento funcione. Hoje podemos dizer que o GNU/Linux está maduro o suficiente para atender todos os perfis de usuários, desde o mais básico ao mais avançado, e existem distribuições para todos os gostros.

As principais distribuições que podemos destacar são:
- [Ubuntu](http://www.ubuntu.com/) - Suportada pela empresa Canonical, é uma derivação do Debian e se propõem a ser uma distribuição altamente amigável para iniciantes sem que isso prejudique sua adoção por usuários mais avançados.
- [Linux Mint](http://www.linuxmint.com/) - Suportada por comunidade, é uma derivação do Debian e Ubuntu e se propõem a ser uma distribuição moderna e confiável.
- [Debian](http://www.debian.org/) - Suportada por comunidade, é uma das mais antigas distribuições e caracteriza-se pela estabilidade e confiança. Possui a maior comunidade de todas as distribuições, tanto em desenvolvedores quanto em número de usuários.
- [Fedora](http://www.getfedora.org/) - Suportada por comunidade e patrocinada pela Red Hat, é uma distribuição derivada do Red Hat Enterprise e que hoje forma as bases desta distribuição.

O site http://distrowatch.com/ faz o acompanhamento das distribuições e se tiverem curiosidade podem acessá-lo para saber quais são as mais utilizadas, as mais novas, tem até um mapa da ramificação das distribuições, um trabalho excelente!

Para o nosso minicurso, como hoje é o Debian Day, a distribuição que iremos trabalhar será o Debian. É talvez a distribuição mais estável e gratuita que vocês irão utilizar e também é a distribuição de referência na comunidade do Software Livre.


# Instalação

Acesse o site do projeto [Debian](http://www.debian.org/) e baixe o instalador. É importante que você tenha acesso à rede via cabo, caso sua placa de rede wireless não seja reconhecida pelo sistema será necessário instalar os drivers proprietários pois o Debian não oferece software proprietário na sua instalação padrão. Mas no próprio site é possível baixar uma versão já com os drivers necessários. No último acesso que fiz o download estava disponível em: https://cdimage.debian.org/cdimage/unofficial/non-free/cd-including-firmware/current/multi-arch/iso-cd/

Baixada a ISO, é necessário agora criar um disco inicializável com o sistema. Para esta tarefa podemos usar algum utilitário do modo gráfico como este da imagem abaixo:

![Utiliário](utilitario-disco.png)

Ou podemos usar a linha de comando para chamar um programa padrão do sistema GNU:

```
  dd if=arquivo.iso of=/dev/sdX
```

Onde /dev/sdX é o caminho para o dispositivo USB onde se pretende gravar a imagem.

Gravada a imagem no pendrive, configure na Bios do computador a inicialização pelo USB e execute o passo a passo para instalação.

Na versão atual, Debian 9, o processo de instalação é bem fácil basta seguir as orientações no modo Próximo, Próximo, Fim e para a grande maioria dos usuários o sistema será instalado. Apenas duas observações são necessárias aqui:

Primeira, como particionar o disco? Esta é uma dúvida muito comum e não é todo mundo que logo no início sabe como funcionam as partições no sitema. A orientação que posso dar é: utilize partição única sem LVM caso queira usar apenas o GNU/Linux na sua máquina, é a maneira mais fácil de usar e gerenciar o sistema. Caso queira usar outro sistema operacional em paralelo, crie uma partição para o novo sistema e utilize partição única. Assim que você tiver mais conhecimento sobre as vantagens de usar partições separadas para o /home e como tirar benefício do LVM arrisque-se e utilize as outras de partição.

Segunda, como escolher a interface gráfica? Aqui será necessário que você conheça seu hardware. Sendo objetivo, as interfaces que consomem mais recurso são: GNOME, KDE, CINNAMON e MATE. Já para as máquinas mais antigas com menos RAM e processador, é aconselhável instalar o lxde ou xfce.

No nosso exercício prático iremos usar uma máquina virtual em um hardware modesto, sendo assim, usaremos lxde.

# Usando a interface gráfica

- Conseguindo ajuda
- Atalhos e dicas
- Instalando programas
- Monitor do sistema

# Usando a linha de comando

- Conseguindo ajuda
  * man intro, man man
  * info, apropos, whatis, help
- Atalhos e dicas
  * session e CTRL-D
  * programa &
  * fg, bg
- Arquivos
  * ls, cd, pwd
  * mkdir touch
  * cp, mv, rm
  * ln (simbolico vs direto)
  * file, stat
  * chmod, chown, sudo, su
  * which, locate, find, grep
  * du, mount, unmount, df
- Instalando programas
  * sudo, dpkg, dpkg-reconfigure, apt
- Sistema
  * env, export
  * date, cal
  * ps, free, top, kill
  * who, whoami, useradd, userdel, passwd
  * uname, lsb_release
  * systemd: systemctl, journalctl
- Rede
  * ping, telnet, netstat -anp, ss, tracepath

# A Estrutura Padrão de Diretórios

https://wiki.debian.org/FilesystemHierarchyStandard
