package web.db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import web.forum.Comment;
import web.forum.ForumTopic;
import web.forum.ForumTopicSub;
import web.user.User;

public final class ForumTopicDB {

    private static List<ForumTopic> forumTopics = new ArrayList<ForumTopic>(Arrays.asList(new ForumTopic("Main Topic 1",
	    new ArrayList<ForumTopicSub>(Arrays.asList(new ForumTopicSub("Subtopic 1", "\r\n" + "\r\n"
		    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus eu massa sed metus molestie pretium. Sed eleifend consectetur erat, congue condimentum nisl laoreet vitae. Integer sed tortor sed dui eleifend condimentum quis vel neque. Nam id tellus turpis. Aenean elementum placerat nisl eu pharetra. Praesent quis risus nec lectus dignissim lacinia sit amet eu diam. Donec lacus nulla, sollicitudin eget leo eu, commodo tristique dui.\r\n"
		    + "\r\n"
		    + "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Maecenas ac semper lacus. Morbi sit amet nulla interdum, cursus nibh quis, imperdiet orci. Donec nec cursus augue, quis cursus magna. Nullam luctus eu tellus ut egestas. Morbi tincidunt erat quis metus commodo lobortis. Pellentesque hendrerit risus nec mi placerat congue. Aenean turpis massa, dapibus et nibh ut, maximus tincidunt lectus. Proin interdum metus venenatis turpis feugiat, sed ultrices mi ultricies.\r\n"
		    + "\r\n"
		    + "Quisque venenatis odio et arcu pulvinar, quis vehicula est tincidunt. Phasellus pulvinar dui vel quam imperdiet volutpat. Suspendisse cursus dui nunc, id hendrerit nulla lacinia eu. Maecenas blandit facilisis dui a dapibus. Praesent sem nisi, rhoncus vitae congue ut, iaculis eget purus. Mauris fringilla est non orci pretium vulputate. Proin laoreet ac odio quis egestas. Aliquam ultricies leo et vulputate ornare. Cras lorem sapien, bibendum non tempus at, pellentesque a sapien. Quisque nec lacus sit amet ex auctor rutrum a vitae sem. Nulla molestie porttitor elit et aliquet. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Integer fringilla nibh urna, vestibulum tincidunt neque placerat posuere. Phasellus et lorem orci. ",
		    new ArrayList<Comment>()),
		    new ForumTopicSub("Subtopic 2", "\r\n" + "\r\n"
			    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean molestie blandit diam ut eleifend. Nam at leo et metus interdum vulputate eget eget turpis. Mauris imperdiet mollis mi, nec ultricies lectus pellentesque eget. Quisque at tincidunt magna. Fusce vitae augue dignissim, molestie mi eu, interdum mauris. Quisque condimentum, tellus rhoncus iaculis scelerisque, tortor lorem vestibulum ante, mattis feugiat risus orci vitae enim. In felis mi, pulvinar eget semper vel, ultrices ac leo. Praesent eu rhoncus ipsum. Nam vitae libero accumsan, porttitor massa sit amet, luctus dui. Nunc sollicitudin porta lorem vel feugiat. Morbi ex ligula, finibus eu semper vitae, vulputate a nibh. Praesent pharetra leo nec justo placerat, quis scelerisque ipsum consectetur. Vestibulum vulputate est risus, a elementum nibh auctor eu. Aliquam blandit felis eget dapibus luctus. Donec eget libero non ex tincidunt convallis.\r\n"
			    + "\r\n"
			    + "Fusce rhoncus, enim eget porttitor malesuada, sapien justo interdum eros, sed malesuada ligula urna molestie risus. Proin ut pulvinar risus. Aenean quis turpis consectetur, cursus est vitae, fringilla arcu. Quisque nec risus a nisl ornare auctor. Cras tempus pharetra nulla ac blandit. Vivamus urna mi, consequat sed efficitur nec, vulputate eget lorem. Morbi a faucibus metus. Aliquam vehicula elit id ex varius aliquam. Nam vulputate vehicula rutrum. Maecenas quis tellus feugiat, pellentesque massa ut, bibendum enim. Nulla ac dui commodo, pharetra tellus at, varius risus.\r\n"
			    + "\r\n"
			    + "Phasellus nibh augue, consequat in accumsan quis, sagittis nec arcu. Quisque non nisl justo. Sed dictum feugiat vestibulum. Phasellus velit diam, dignissim ornare elementum vitae, laoreet laoreet nibh. Maecenas sed mauris enim. Proin hendrerit odio ut diam bibendum pretium. Quisque blandit cursus risus, eget auctor libero blandit at. Suspendisse potenti. Phasellus sit amet ipsum nec purus maximus pellentesque. Suspendisse rhoncus posuere nisi, vel maximus ligula imperdiet nec. Curabitur in quam ullamcorper nunc maximus malesuada eget nec tortor. Etiam vel orci a nulla facilisis maximus. Aenean fringilla malesuada ex, nec elementum quam egestas sit amet. ",
			    new ArrayList<Comment>()),
		    new ForumTopicSub("Subtopic 3", "\r\n" + "\r\n"
			    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent faucibus finibus pellentesque. Suspendisse sit amet sollicitudin mi. Nam congue odio sit amet venenatis dictum. Curabitur varius ornare euismod. Morbi in libero eget nulla pretium vehicula vel faucibus est. Nulla fermentum lacus tincidunt, dictum ligula et, venenatis ligula. Ut semper tortor at ex gravida suscipit. Suspendisse vel quam felis.\r\n"
			    + "\r\n"
			    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc feugiat, purus vel lacinia hendrerit, erat massa interdum quam, nec ultrices nisl lorem nec enim. Cras lacinia tristique velit non rhoncus. Pellentesque ac ipsum at dui bibendum molestie molestie eu mauris. Pellentesque porta sapien mi. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec maximus urna nec vestibulum pharetra. Cras sit amet volutpat mi. Sed convallis vitae lacus quis mattis. Mauris tincidunt quis arcu sit amet bibendum. Curabitur ut cursus quam. Ut in luctus nisi. Maecenas vel cursus dolor. Aenean eget consectetur nulla. Sed varius rutrum elit eget suscipit.\r\n"
			    + "\r\n"
			    + "Vivamus sit amet velit nibh. Mauris elementum tellus in ipsum maximus aliquam a sit amet dolor. Nulla sed ligula sed enim condimentum egestas. Donec odio nulla, molestie in tempus vel, pellentesque et dui. Vestibulum varius aliquam porta. Curabitur id purus leo. Donec id posuere nulla. Aliquam iaculis lacus blandit nibh hendrerit, sed sollicitudin dui porttitor. ",
			    new ArrayList<Comment>())))),
	    new ForumTopic("Main Topic 2", new ArrayList<ForumTopicSub>(Arrays.asList(
		    new ForumTopicSub("Subtopic 1", "\r\n" + "\r\n"
			    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. In blandit at metus sit amet placerat. Ut convallis urna quam. Vivamus nec lacus ut est venenatis sagittis. Aenean eget rutrum sapien, non viverra enim. Morbi placerat enim ut suscipit aliquam. Vestibulum sodales viverra nisl, sit amet porta risus cursus eget. In ultricies sapien vel tellus egestas, nec pretium mi eleifend. Nunc cursus id quam eu dignissim.\r\n"
			    + "\r\n"
			    + "Suspendisse eget mollis massa. Phasellus ac tellus id mauris pretium tempus. Proin lacinia congue nibh. Sed cursus, nulla ullamcorper maximus sagittis, mi purus rutrum velit, et suscipit massa velit a diam. Aenean maximus congue magna, vel porta risus accumsan a. Donec eros diam, volutpat sed nibh ac, vehicula euismod erat. Sed viverra justo lectus, et mollis mi tincidunt vel. Nunc imperdiet efficitur ante, at faucibus tellus lobortis id. Nunc venenatis lacus quis nunc aliquet condimentum. Praesent dignissim luctus volutpat. Suspendisse et dignissim ipsum. Donec sollicitudin nisi nec diam vehicula, sed mattis tellus fermentum. Nam condimentum metus a lacus consequat dignissim. Ut in semper velit, in accumsan dui. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Pellentesque non faucibus ipsum.\r\n"
			    + "\r\n"
			    + "Vivamus eu porttitor mauris. Mauris maximus iaculis ex vel mollis. Vivamus eu fringilla enim. Fusce sit amet justo in felis convallis pulvinar. Praesent lobortis diam quis cursus pharetra. Nam lacinia, enim at facilisis luctus, turpis neque commodo ipsum, vel condimentum ante libero mollis odio. Vivamus vitae tincidunt dolor. Aliquam erat volutpat. Integer sed dignissim urna. In congue, nulla vitae consectetur volutpat, nulla purus malesuada sapien, id tincidunt diam nulla ac ligula. ",
			    new ArrayList<Comment>()),
		    new ForumTopicSub("Subtopic 2", "\r\n" + "\r\n"
			    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce eget tortor nec odio viverra finibus. Aliquam aliquet rutrum quam. Duis nibh metus, porttitor maximus aliquam nec, tincidunt non magna. Pellentesque tempor magna sit amet augue tincidunt pharetra. Proin sit amet enim at ante luctus vulputate ut eget urna. Vivamus mattis mi sed lacus volutpat, lacinia interdum purus dapibus. Suspendisse sed interdum libero, id molestie ligula. Maecenas sed ultricies nisi.\r\n"
			    + "\r\n"
			    + "Donec consequat pellentesque turpis, eu eleifend velit tempor vitae. Morbi accumsan velit nec accumsan sagittis. Ut ut euismod lectus, at commodo lacus. Curabitur vulputate feugiat justo, id scelerisque augue viverra pharetra. Mauris semper maximus sem, nec gravida orci luctus ac. Ut dui metus, bibendum at lectus a, imperdiet eleifend neque. Mauris facilisis scelerisque diam. In rhoncus volutpat tortor, vel pharetra mi varius id. Sed quis molestie neque. Aliquam erat volutpat.\r\n"
			    + "\r\n"
			    + "Sed sagittis tortor vel placerat imperdiet. Aenean pulvinar lorem vitae congue ultrices. Nullam congue blandit nisi, in tincidunt ligula mattis vel. Phasellus venenatis lectus eget efficitur interdum. Aliquam ornare viverra nibh vitae gravida. Phasellus fermentum, libero ac semper faucibus, orci magna ullamcorper nisl, ut bibendum lacus lorem nec tellus. Fusce vel dui a leo sollicitudin dignissim eget sit amet lorem. Integer vitae purus sed nunc consequat dignissim a et nibh. Mauris lorem nulla, placerat id eleifend et, blandit quis dui. Etiam commodo rutrum dui, eu iaculis diam mattis tristique. Vestibulum sed vehicula eros. Proin nec velit quis nisi suscipit congue. Aliquam a justo vitae dui facilisis tristique id a ex. Aliquam faucibus, augue sollicitudin sagittis laoreet, odio sem dignissim diam, ac eleifend sapien nulla non leo. Praesent purus dui, egestas ac molestie finibus, condimentum quis mi. Morbi ut nunc libero. ",
			    new ArrayList<Comment>()),
		    new ForumTopicSub("Subtopic 3", "\r\n" + "\r\n"
			    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent vulputate efficitur dui sed sodales. Vestibulum eu imperdiet diam. Cras eu facilisis tellus, in hendrerit turpis. Donec vestibulum, lacus eget vestibulum blandit, ipsum nisl gravida augue, nec commodo dolor nulla eu neque. Vivamus pellentesque dapibus leo, quis semper tortor volutpat eget. Sed mattis nunc sapien, id tincidunt velit fermentum ut. Fusce imperdiet quis justo vitae condimentum. In pulvinar sed tortor a convallis. Donec accumsan ex ex, in ultricies enim eleifend lacinia. Donec pellentesque neque venenatis placerat aliquet. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Suspendisse potenti.\r\n"
			    + "\r\n"
			    + "Vestibulum non tristique odio. Donec eu dictum velit. Cras eu diam suscipit, maximus mauris sed, pulvinar elit. In hac habitasse platea dictumst. Pellentesque at vehicula dolor, id tristique urna. Sed aliquam risus eu est porta semper. Nam egestas augue nec sapien eleifend porttitor. Nullam rhoncus porttitor lorem. In et arcu feugiat, dictum sem cursus, efficitur orci. Sed in efficitur mi.\r\n"
			    + "\r\n"
			    + "Duis aliquet leo libero. Vivamus massa massa, mattis in luctus a, lobortis ut diam. Quisque gravida nibh at ullamcorper tristique. Vivamus at gravida dui. Nullam laoreet facilisis sodales. Aliquam condimentum odio eu ultricies bibendum. Nullam interdum lacus in diam facilisis, ut hendrerit diam malesuada. ",
			    new ArrayList<Comment>())))),
	    new ForumTopic("Main Topic 3", new ArrayList<ForumTopicSub>(Arrays.asList(
		    new ForumTopicSub("Subtopic 1", "\r\n" + "\r\n"
			    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus vel scelerisque arcu. Sed convallis pulvinar urna quis rhoncus. Maecenas feugiat enim quis dictum sollicitudin. Phasellus id pretium est. Fusce in sem sit amet dolor porttitor consequat sed vel mi. Ut accumsan, mauris vitae posuere finibus, erat metus aliquet odio, id mollis nunc est nec neque. Fusce egestas nulla non odio maximus, ac ullamcorper odio laoreet. Integer eget gravida enim. Proin suscipit dolor eget congue hendrerit. Proin non ullamcorper ipsum. Quisque egestas semper urna sit amet fringilla.\r\n"
			    + "\r\n"
			    + "In sit amet pellentesque orci. In sed euismod quam. Vivamus eget mattis odio, id cursus dolor. Aenean ut malesuada mi, quis commodo ante. Phasellus ac elit libero. Curabitur eget risus erat. Fusce neque ligula, imperdiet quis cursus id, commodo ut lectus. Aliquam malesuada imperdiet felis non facilisis. Sed faucibus mauris nec elementum tristique. Nulla vel cursus turpis. Sed sagittis vitae est vel cursus. Praesent at turpis eget dolor commodo tristique non consectetur felis. Praesent venenatis malesuada elit, a convallis neque dapibus ac.\r\n"
			    + "\r\n"
			    + "Morbi fermentum, lacus vel varius aliquet, ante sem sodales ante, at imperdiet turpis augue quis tortor. Mauris vel urna at turpis ullamcorper suscipit. Maecenas fringilla nibh in consectetur varius. Sed luctus semper ultrices. Integer viverra erat sed odio sodales, ac congue elit fringilla. In vehicula odio eu orci facilisis sagittis. Nulla rutrum arcu et hendrerit porta. Ut id interdum est. Proin ut dolor quis tortor pellentesque iaculis. Morbi nec dui mi. Integer vitae molestie augue, ac venenatis diam. Quisque suscipit nisl sit amet ultricies sagittis. Duis eget fringilla diam. Nunc et libero vitae nulla rutrum tempus a eget nunc. Nam lobortis imperdiet nulla. Phasellus maximus imperdiet nulla non ultrices. ",
			    new ArrayList<Comment>()),
		    new ForumTopicSub("Subtopic 2", "\r\n" + "\r\n"
			    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin iaculis auctor tortor. Nam et quam euismod, gravida magna id, euismod tortor. Nam tortor arcu, fermentum et ipsum non, convallis ornare massa. Quisque iaculis nisl ex, vel interdum eros bibendum id. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Cras non velit vestibulum, luctus mauris sed, pulvinar neque. Duis fermentum quis diam eu sagittis. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Phasellus vitae sem enim. Praesent vitae maximus urna. Fusce rutrum turpis vitae nulla volutpat, quis consectetur lectus placerat. Etiam placerat mauris dui, et congue odio sagittis et. Phasellus sem elit, convallis et tortor faucibus, consectetur vehicula dolor.\r\n"
			    + "\r\n"
			    + "Donec ut nulla ipsum. Sed quis pellentesque lorem, nec lacinia nibh. Integer tincidunt efficitur arcu, ut lobortis purus accumsan id. In elementum augue ac congue porta. Quisque sagittis tellus nibh, sit amet tempus tortor vehicula ac. Sed felis velit, consequat in vulputate sed, imperdiet nec arcu. Aliquam vitae condimentum nibh. Nunc eget lorem sit amet metus lobortis porttitor facilisis id nunc. Ut nec varius purus.\r\n"
			    + "\r\n"
			    + "Maecenas faucibus, nunc ut aliquet luctus, dolor diam mollis mi, at scelerisque lacus leo bibendum velit. Duis suscipit, elit ac sollicitudin tempus, tellus odio rhoncus libero, sit amet tincidunt leo purus quis lectus. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum ultricies lorem eget ante pulvinar, ut scelerisque quam dictum. Donec lacinia dictum felis, ut consectetur mauris dapibus quis. Morbi sed sagittis nulla. Nam eleifend hendrerit elementum. Donec semper, eros in aliquet ultricies, sem odio iaculis ligula, consequat hendrerit quam nisl in sapien. Curabitur sit amet ligula auctor, sodales est nec, aliquam sapien. Aliquam erat volutpat. Sed rhoncus in augue a laoreet. In pharetra nisi justo, in vestibulum urna pretium eget. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. ",
			    new ArrayList<Comment>()),
		    new ForumTopicSub("Subtopic 3", "\r\n" + "\r\n"
			    + "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Morbi id pulvinar justo, quis vehicula massa. Morbi vel ligula sed orci semper gravida. Duis lorem nisl, condimentum quis diam ac, lacinia ultrices leo. Vestibulum lacus erat, volutpat nec congue non, tempor sed magna. Nunc a diam ut diam maximus tempus non at tellus. Curabitur laoreet interdum viverra. In placerat lacus in lectus sagittis commodo. Etiam ut dui arcu. Sed id viverra neque, et gravida sapien. Donec dapibus felis ac est euismod, sagittis ultrices ex rutrum. Duis facilisis interdum tellus id consectetur. Duis ante lacus, varius ut sapien at, dignissim dictum orci.\r\n"
			    + "\r\n"
			    + "Pellentesque non rhoncus quam. Pellentesque malesuada velit ut tortor tincidunt accumsan. Nunc facilisis justo massa, in maximus enim placerat nec. Duis vel felis nec erat commodo lacinia. Duis vulputate ligula viverra eros volutpat, id tempor libero tincidunt. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Aliquam erat volutpat. Cras tincidunt elit quis nulla tristique facilisis. Morbi at pulvinar turpis, quis maximus nunc. Aenean tellus quam, malesuada a consectetur eu, mollis et lacus. Praesent efficitur tristique quam.\r\n"
			    + "\r\n"
			    + "Nunc gravida, mi sed vestibulum sodales, augue leo consequat ligula, vel vulputate lectus libero in ex. Nunc aliquet nibh augue, porta suscipit nibh laoreet vitae. Vivamus nec libero et massa auctor tincidunt eget ac magna. Nulla facilisi. Ut et felis nunc. Duis ac laoreet nunc. Suspendisse potenti. ",
			    new ArrayList<Comment>()))))));

    public static ArrayList<ForumTopic> getForumTopics() {
	return (ArrayList<ForumTopic>) forumTopics;
    }

    public static ArrayList<ForumTopicSub> getForumSubTopics(int index) {
	return forumTopics.get(index).getSubTopics();
    }

    public static ForumTopicSub getForumSubContent(int indexMain, int indexSub) {
	return forumTopics.get(indexMain).getSubTopics().get(indexSub);
    }

    public static void addComment(int indexMain, int indexSub, User user, String comment) {
	forumTopics.get(indexMain).getSubTopics().get(indexSub).getComments().add(new Comment(user, comment));
    }
}
